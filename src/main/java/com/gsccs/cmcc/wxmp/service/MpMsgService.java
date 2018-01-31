package com.gsccs.cmcc.wxmp.service;

import java.util.Map;

public interface MpMsgService {

	// 批量发送
	public void sendBatchMsg(String appid, String tmlShortId, String url,
			Map<String, Map<String, String>> userMsgMap);

	// 单条发送
	public void sendMsg(String appid, String openid, String tmlShortId,String tmlLongId,
			String url, Map<String, String> msgMap);
	
}
