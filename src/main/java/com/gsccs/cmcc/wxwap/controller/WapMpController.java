package com.gsccs.cmcc.wxwap.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.gsccs.cmcc.wxmp.service.WxAppService;
import com.gsccs.cmcc.wxmp.service.WxMpInDBConfigStorage;

/**
 * 微信应用
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class WapMpController{

	@Autowired
	protected WxAppService wxAppService;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	
	public String getReqUrl(){
		StringBuilder sb = new StringBuilder();
		sb.append(request.getScheme()).append("://");
		sb.append(request.getServerName());
		
		int port = request.getServerPort();
		if (port!=80){
			sb.append(":").append(request.getServerPort());
		}
		sb.append(request.getContextPath());
		sb.append(request.getServletPath());
		return sb.toString();
	}
	
	
	public String getOpenid(String appid,String code){
		try {
			WxMpInDBConfigStorage wxMpConfigStorage = wxAppService.getMpConfig(appid);
			WxMpService wxMpService = new WxMpServiceImpl();
			wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
			wxMpService.getAccessToken(true);
			//不存在获取code
			if(StringUtils.isEmpty(code)){	
				String requrl = getReqUrl(); 
				String authUrl = wxMpService.oauth2buildAuthorizationUrl(requrl, WxConsts.OAuth2Scope.SNSAPI_USERINFO, null);
				return "redirect:"+authUrl; 
			}else{
				//根据code获取openid
				WxMpOAuth2AccessToken accessToken = wxMpService.oauth2getAccessToken(code);
				return accessToken.getOpenId();
			}
		} catch (WxErrorException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	
}
