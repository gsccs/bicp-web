package com.gsccs.cmcc.wxmp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.wxmp.handler.LogHandler;
import com.gsccs.cmcc.wxmp.handler.MsgHandler;
import com.gsccs.cmcc.wxmp.handler.SubscribeHandler;
import com.gsccs.cmcc.wxmp.service.WxAppService;
import com.gsccs.cmcc.wxmp.service.WxMpInDBConfigStorage;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 
 * 
 */
@Controller
@RequestMapping("/api/{appid}")
public class WxPortalController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private WxAppService wxAppService;
	@Autowired
    protected LogHandler logHandler;
    @Autowired
    protected SubscribeHandler subscribeHandler;
    @Autowired
    protected MsgHandler msgHandler;

    private WxMpMessageRouter router;
    WxMpInDBConfigStorage wxMpConfigStorage;
   
    @ResponseBody
    @RequestMapping(value="/auth", method = RequestMethod.GET)
    public String authGet(
    		@PathVariable("appid") String appid,
    		@RequestParam(value = "signature", required = false) String signature,
            @RequestParam(value = "timestamp", required = false) String timestamp,
            @RequestParam(value = "nonce", required = false) String nonce,
            @RequestParam(value = "echostr", required = false) String echostr,HttpServletResponse response) {
    	this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}, {}]", signature, timestamp, nonce, echostr);
    	response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		wxMpConfigStorage = wxAppService.getMpConfig(appid);
		WxMpService wxMpService = new WxMpServiceImpl();
		wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
		
		if (wxMpService.checkSignature(timestamp, nonce, signature)) {
			return echostr;
		}
		return "非法请求";
    }
    
    
    
	/**
	 * 微信公众号webservice主服务接口，提供与微信服务器的信息交互
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws Exception
	 */
	@RequestMapping(value="/auth", method = RequestMethod.POST)
	public void authPost(@PathVariable("appid") String appid,
			@RequestBody String requestBody,
			@RequestParam(value = "encrypt_type", required = false) String encType,
			@RequestParam(value = "signature", required = false) String signature,
	        @RequestParam(value = "timestamp", required = false) String timestamp,
	        @RequestParam(value = "nonce", required = false) String nonce,
	        @RequestParam(value = "echostr", required = false) String echostr,
	        @RequestParam(value = "msg_signature", required = false) String msgSignature,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		wxMpConfigStorage = wxAppService.getMpConfig(appid);
		WxMpService wxMpService = new WxMpServiceImpl();
		wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
		
		if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			response.getWriter().println("非法请求");
			return;
		}

		if (StringUtils.isNotBlank(echostr)) {
			// 说明是一个仅仅用来验证的请求，回显echostr
			response.getWriter().println(echostr);
			return;
		}

		String encryptType = StringUtils.isBlank(encType) ? "raw" : encType;

		if ("raw".equals(encryptType)) {
			// 明文传输的消息
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
			refreshRouter(wxMpService);
			WxMpXmlOutMessage outMessage = route(inMessage);
			response.getWriter().write(outMessage.toXml());
			return;
		}

		if ("aes".equals(encryptType)) {
			// 是aes加密的消息
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(requestBody,
					wxMpConfigStorage, timestamp, nonce, msgSignature);
			System.out.println("\n消息解密后内容为：\n{} "+inMessage.toString());
			refreshRouter(wxMpService);
			WxMpXmlOutMessage outMessage = route(inMessage);
			System.out.println(response.toString());
			response.getWriter()
					.write(outMessage.toEncryptedXml(wxMpConfigStorage));
			return;
		}

		response.getWriter().println("不可识别的加密类型");
		return;
	}


	/**
	 * 通过code获得基本用户信息 详情请见:
	 * http://mp.weixin.qq.com/wiki/14/bb5031008f1494a59c6f71fa0f319c66.html
	 * 
	 * @param response
	 * @param code
	 *            code
	 * @param lang
	 *            zh_CN, zh_TW, en
	 */
	@RequestMapping(value="/authUrl", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg getOAuth2UserInfo(
			@PathVariable("appid") String appid,
			@RequestParam(value = "code") String code,
			@RequestParam(value = "lang") String lang,HttpServletResponse response) {
		JsonMsg jsonMsg = new JsonMsg();
		WxMpOAuth2AccessToken accessToken;
		try {
			wxMpConfigStorage = wxAppService.getMpConfig(appid);
			WxMpService wxMpService = new WxMpServiceImpl();
			wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
			accessToken = wxMpService.oauth2getAccessToken(code);
			jsonMsg.setData(accessToken.getOpenId());
			jsonMsg.setSuccess(true);
		} catch (WxErrorException e) {
			jsonMsg.setSuccess(false);
		}
		return jsonMsg;
	}

	/**
	 * 用code换取oauth2的openid 详情请见:
	 * http://mp.weixin.qq.com/wiki/1/8a5ce6257f1d3b2afb20f83e72b72ce9.html
	 * 
	 * @param response
	 * @param code
	 *            code
	 */
	@RequestMapping(value="/getOpenid", method = RequestMethod.POST)
	public void getOpenid(HttpServletResponse response,
			@RequestParam(value = "code") String code) {
		WxMpOAuth2AccessToken accessToken;
		WxMpService wxMpService = null;
		try {
			accessToken = wxMpService.oauth2getAccessToken(code);
		} catch (WxErrorException e) {
		}
	}
	
    public void refreshRouter(WxMpService wxMpService) {
        final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);
        // 记录所有事件的日志
        newRouter.rule().handler(this.logHandler).next();
        // 关注事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.TEXT)
                .event(WxConsts.EventType.SUBSCRIBE).handler(subscribeHandler)
                .end();
        // 默认
        newRouter.rule().async(false).handler(msgHandler).end();
        this.router = newRouter;
    }

    public WxMpXmlOutMessage route(WxMpXmlMessage inMessage) {
        try {
            return this.router.route(inMessage);
        } catch (Exception e) {
        }

        return null;
    }

}
