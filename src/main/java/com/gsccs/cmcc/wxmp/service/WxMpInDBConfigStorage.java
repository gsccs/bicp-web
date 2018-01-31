package com.gsccs.cmcc.wxmp.service;

import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;

import org.springframework.stereotype.Service;

/**
 * 微信应用信息存储
 * 
 */
@Service
public class WxMpInDBConfigStorage extends WxMpInMemoryConfigStorage {

	protected volatile String appId;
	
	
	public String getAppId() {
		return appId;
	}


	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	
}
