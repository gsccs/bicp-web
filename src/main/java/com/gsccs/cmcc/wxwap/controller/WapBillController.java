package com.gsccs.cmcc.wxwap.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/web/{appid}")
public class WapBillController extends WapMpController{

	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/bills")
	public String list(WxApp param,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {

		List<WxApp> wxAppList = wxAppService.find(param, order, currPage,
				pageSize, false);
		int totalCount = wxAppService.count(param);
		map.put("list", wxAppList);
		map.put("order", order);
		return "wxwap/bill_list";
	}

	
	/**
	 * 新增表单页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/add.do")
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
	@RequestMapping("/edit.do")
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
	@RequestMapping("/editDo.do")
	public String editDo(WxApp wxApp, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
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
	@RequestMapping("/addDo.do")
	public String addDo(WxApp wxApp, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		String oper = "添加";
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
	

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/del.do")
	public String del(String pageFuncId, String ids,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response) {
		map.put("msg", "操作成功");
		map.put("forwardUrl", "wxapp/list.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}
	
	
}
