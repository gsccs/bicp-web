package com.gsccs.cmcc.wxmp.handler;

import me.chanjar.weixin.mp.api.WxMpMessageHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

/**
 * 消息处理Handler的父类
 * 
 */
public abstract class AbstractHandler implements WxMpMessageHandler {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	protected final Gson gson = new Gson();
}
