package com.gsccs.cmcc.wxmp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MpMsgServiceImpl implements MpMsgService {

	@Autowired
	private WxAppService wxAppService;
	WxMpConfigStorage wxMpConfigStorage;

	@Override
	public void sendMsg(String appid,String openid,String tmlShortId, String tmlLongId,String url,
			Map<String, String> msgMap) {
		try {
			
			WxMpService wxMpService = new WxMpServiceImpl();
			wxMpConfigStorage = wxAppService.getMpConfig(appid);
			wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
		    String accessToken = wxMpService.getAccessToken(true);
		    System.out.println(accessToken);
			// 模板消息
			if (StringUtils.isEmpty(tmlLongId)){
				//String templateid = wxMpService.getTemplateId(tmlShortId);
				tmlLongId = wxMpService.getTemplateMsgService().addTemplate(tmlShortId);
			}
			//String templateid = wxMpService.getTemplateId(tmlShortId);
			//String templateid = wxMpService.getTemplateMsgService().addTemplate(tmlShortId);
			WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
					.toUser(openid)
					.templateId(tmlLongId)
					.url(url)
					.build();
			
			List<WxMpTemplateData> msgdatas = new ArrayList<>();
			if (null != msgMap && !msgMap.isEmpty()) {
				Iterator<String> its = msgMap.keySet().iterator();
				while (its.hasNext()) {
					String key = its.next();

					WxMpTemplateData tempData = new WxMpTemplateData();
					tempData.setName(key);
					tempData.setValue(msgMap.get(key));
					msgdatas.add(tempData);
					templateMessage.getData().add(new WxMpTemplateData(key, msgMap.get(key), ""));
				}
			}
			wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
			//wxMpService.getTemplateMsgService().delPrivateTemplate(tmlLongId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendBatchMsg(String appid,String templateid,
			String url,Map<String, Map<String, String>> usermsgs) {
		try {
			List<WxMpTemplateMessage> messages = new CopyOnWriteArrayList<>();
			List<WxMpTemplateData> msgdatas = new ArrayList<>();
			if (null != usermsgs && !usermsgs.isEmpty()) {
				Iterator<String> msgMaps = usermsgs.keySet().iterator();
				while (msgMaps.hasNext()) {
					String openid = msgMaps.next();
					Map<String, String> msgMap = usermsgs.get(openid);
					if (null != msgMap && !msgMap.isEmpty()) {
						Iterator<String> its = msgMap.keySet().iterator();
						while (its.hasNext()) {
							String key = its.next();
							WxMpTemplateData tempData = new WxMpTemplateData();
							tempData.setName(key);
							tempData.setValue(msgMap.get(key));
							msgdatas.add(tempData);
						}
					}
					// 模板消息
					WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
							.toUser(openid)
							.templateId(templateid)
							.url(url)
							.data(msgdatas)
							.build();
					messages.add(templateMessage);
				}
			}
			startSender(appid,messages);
		} catch (Exception e) {
			System.out.println("模板消息发送错误:"+e.getLocalizedMessage());
			//e.printStackTrace();
		}
	}

	/**
	 * 启动发送线程
	 */
	public void startSender(final String appid,final List<WxMpTemplateMessage> messages) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				WxMpService wxMpService = null;
				while (!messages.isEmpty()) {
					if (null == wxMpService) {
						//wxMpConfigStorage.init(appid);
						wxMpService = new WxMpServiceImpl();
						wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
						try {
							wxMpService.getAccessToken(true);
						} catch (WxErrorException e) {
							System.out.println("推送消息失败,错误原因:"+e.getLocalizedMessage());
						}
					}
					// 当缓冲区没有数据的时候，此方法会阻塞
					for (WxMpTemplateMessage message : messages) {
						//
						try {
							wxMpService.getTemplateMsgService().sendTemplateMsg(message);
						} catch (WxErrorException e) {
							System.out.println(appid+":"+message.getTemplateId()+"：推送消息失败："+message.getToUser()+"错误原因:"+e.getLocalizedMessage());
						}finally{
							messages.remove(message);
						}
					}
				}
				System.out.println("模板消息发送线程退出");
			}
		};
		thread.setName("TemplateMessageSender");
		thread.start();
	}

}
