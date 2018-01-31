package com.gsccs.cmcc.wxwap.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.plat.bass.JsonMsg;

/**
 * 微信前端应用
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/web/{appid}")
public class WapUserController extends WapMpController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 会员微信绑定页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/wxUserBind", method = RequestMethod.GET)
	public String wxUserBind(
			@PathVariable("appid") String appid,
			@RequestParam(value="openid") String openid,
			@RequestParam(value="code") String code,ModelMap map) {
		if(StringUtils.isEmpty(openid)){
			openid = getOpenid(appid,code);
		}
		map.put("appid", appid);
		map.put("openid", openid);
		return "wxwap/user_bind";
	}
	
	
	
	/**
	 * 会员微信绑定
	 * @param openid
	 * @param userid
	 * @param nonce
	 * @param response
	 * @return
	 */
	@ResponseBody
    @RequestMapping(value="/wxUserBind", method = RequestMethod.POST)
    public JsonMsg wxUserBind(
    		@PathVariable("appid") String appid,
    		@RequestParam(value = "openid", required = true) String openid,
            @RequestParam(value = "userid", required = true) String userid,
            @RequestParam(value = "nonce", required = true) String nonce,
            HttpServletResponse response) {
    	this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}]", openid, userid, nonce);
    	JsonMsg jsonMsg = new JsonMsg();
    	jsonMsg.setSuccess(true);
		return jsonMsg;
    }

	
}
