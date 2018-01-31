package com.gsccs.cmcc.wxmp.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutTextMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

/**
 * 用户关注公众号Handler
 * 
 */
@Component
public class SubscribeHandler extends AbstractHandler {

	@Override
	public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
			Map<String, Object> context, WxMpService wxMpService,
			WxSessionManager sessionManager) throws WxErrorException {
		WxMpUser wxMpUser = wxMpService.getUserService().userInfo(wxMessage.getFromUser(), "zh_CN");
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("openId", wxMpUser.getOpenId()));
		params.add(new BasicNameValuePair("nickname", wxMpUser.getNickname()));
		params.add(new BasicNameValuePair("headImgUrl", wxMpUser
				.getHeadImgUrl()));

		WxMpXmlOutTextMessage m = WxMpXmlOutMessage.TEXT()
				.content("尊敬的" + wxMpUser.getNickname() + "，您好!")
				.fromUser(wxMessage.getToUser())
				.toUser(wxMessage.getFromUser()).build();
		logger.info("subscribeMessageHandler" + m.getContent());
		return m;
	}

};
