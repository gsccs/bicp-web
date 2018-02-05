package com.gsccs.cmcc.wxmp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cmcc.wxmp.model.WxApp;
import com.gsccs.cmcc.wxmp.service.WxAppService;

/**
 * 微信账号管理
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "/wxapp")
public class WxAppController{

	@Autowired
	private WxAppService wxAppService;
	
	
	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/list.do")
	public String list(WxApp param,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map) {
		List<WxApp> wxAppList = wxAppService.find(param, order, currPage,
				pageSize, false);
		int totalCount = wxAppService.count(param);
		map.put("list", wxAppList);
		map.put("order", order);
		return "weixin/app_list";
	}

	
	/**
	 * 新增表单页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/add.do")
	public String wxAppEdit(ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		return "weixin/app_add";
	}

	
	/**
	 * 修改表单页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/edit.do")
	public String wxAppEdit(String id, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		WxApp wxApp = wxAppService.findById(id);
		map.put("wxapp", wxApp);
		return "weixin/app_edit";
	}

	
	/**
	 * 编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/editDo", method = RequestMethod.POST)
	public String editDo(WxApp wxApp, ModelMap map) {
		String oper = "修改";
		if (null==wxApp || StringUtils.isEmpty(wxApp.getId())){
			map.put("msg", "保存失败，数据有误!");
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			return "admin/msg";
		}
		try {
			wxAppService.update(wxApp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "admin/msg";
	}
	
	
	/**
	 * 编辑
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/addDo", method = RequestMethod.POST)
	public String addDo(WxApp wxApp, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		if (null==wxApp || StringUtils.isEmpty(wxApp.getId())){
			map.put("msg", "保存失败，数据有误!");
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			return "admin/msg";
		}
		try {
			wxAppService.add(wxApp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "admin/msg";
	}
	
}
