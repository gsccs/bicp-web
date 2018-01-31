package com.gsccs.cmcc.wxmp.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.wxmp.model.WxApp;
import com.gsccs.cmcc.wxmp.model.WxTemplet;
import com.gsccs.cmcc.wxmp.service.MpMsgService;
import com.gsccs.cmcc.wxmp.service.WxAppService;
import com.gsccs.cmcc.wxmp.service.WxTempletService;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 微信模板管理
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "/wxtml")
public class WxTempletController{
	// 模板名称：党课提醒
	private String tmlShortId = "OPENTM407110104";
	private String tmlLongId = "cfhJ9LBTJEELwZUmXWSdaPdKIRcvoEWB6X6cozX-_SY";

	@Autowired
	private WxAppService wxAppService;
	@Autowired
	private WxTempletService wxTempletService;
	@Autowired
	private WxMpConfigStorage wxMpConfigStorage;
	@Autowired
	private MpMsgService mpMsgService;
	
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(WxApp param,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {

		List<WxApp> wxAppList = wxAppService.find(param, order, currPage,
				pageSize, false);
		int totalCount = wxAppService.count(param);
		return "wxmp/tmpmsg-list";
	}

	/**
	 * 发送消息
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/tmpMsgForm", method = RequestMethod.GET)
	public String wxTmpMsgForm(ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		return "wxmp/tmpmsg-form";
	}
	
	@ResponseBody
	@RequestMapping(value = "/tmpMsgSend", method = RequestMethod.POST)
	public JsonMsg wxTmpMsgSend(ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("tmpMsgSend");
		JsonMsg jsonMsg = new JsonMsg();
		Map<String, String> msgMap = new HashMap<String, String>();
		msgMap.put("taskname", "测试");
		msgMap.put("tasktime", df.format(new Date()));
		msgMap.put("address", "测试地址");
		try{
			mpMsgService.sendMsg("wxa2e35b9927db7ae8", "oEa40wwHRaSAAQBrOlKpWYHUjJ5c", tmlShortId,tmlLongId, "", msgMap);
			jsonMsg.setSuccess(true);
			jsonMsg.setMsg("发送成功 ");
		}catch(Exception e){
			jsonMsg.setSuccess(false);
			jsonMsg.setMsg(e.getMessage());
		}
		return jsonMsg;
	}


	/**
	 * 根据短模板ID获取长模板ＩＤ
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/getTmlLongId.do", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg getTmlLongId(ModelMap map, HttpServletResponse response) {
		JsonMsg json = new JsonMsg();
		WxApp param = new WxApp();
		param.setStatus("1");
		List<WxApp> wxAppList = wxAppService.find(param, "", 1,Integer.MAX_VALUE, false);
		for (WxApp wxApp : wxAppList) {
			try {
				//wxMpConfigStorage.init(wxApp.getId());
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
				wxMpService.getAccessToken(true);
				String tmlLongId = wxMpService.getTemplateMsgService().addTemplate(tmlShortId);
				WxTemplet wxTemplet = new WxTemplet();
				wxTemplet.setAppid(wxApp.getId());
				wxTemplet.setLongid(tmlLongId);
				wxTemplet.setShortid(tmlShortId);
				wxTempletService.add(wxTemplet);
			} catch (WxErrorException e) {
				System.out.println("获取失败："+wxApp.getId() +":"+e.getLocalizedMessage());
			}
		}
		return json;
	}

	/**
	 * 编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/addDo", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg addDo(WxApp wxApp, ModelMap map, HttpServletResponse response) {
		JsonMsg json = new JsonMsg();
		if (null == wxApp || StringUtils.isEmpty(wxApp.getId())) {
			json.setSuccess(false);
			json.setMsg("保存失败，数据有误!");
			return json;
		}
		try {
			wxAppService.add(wxApp);
			json.setSuccess(true);
			json.setMsg("保存成功!");
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("保存失败，数据有误!");
			e.printStackTrace();
		}
		return json;
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/del", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg del(String ids,
			ModelMap map,
			HttpServletResponse response) {
		JsonMsg json = new JsonMsg();
		json.setSuccess(true);
		json.setMsg("保存成功!");
		return json;
	}

}
