package com.gsccs.cmcc.info.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.info.model.Terminal;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.TerminalHisService;
import com.gsccs.cmcc.info.service.TerminalService;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 终端管理
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/terminal")
public class TerminalController {

	@Autowired
	private TerminalService terminalService;
	@Autowired
	private MerchantService merchantService;
	@Autowired
	private TerminalHisService terminalHisService;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 终端清单
	 * 
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		return "terminal/terminal-list";
	}

	
	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " ordernum  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, Terminal param,
			HttpServletRequest request) {
		
		List<Terminal> list = terminalService.find(param, order, page,
				rows);
		int count = terminalService.count(param);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	/**
	 * 设备表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id, ModelMap map) {
		Terminal terminal = null;
		//获得客户经理
		List<User> userList = userService.findByRoleCode(Constants.ROLE_YY_AM);
		map.addAttribute("userList", userList);
		
		if (StringUtils.isNotEmpty(id)) {
			terminal = terminalService.get(id);
		}else{
		}
		map.put("terminal", terminal);
		return "terminal/terminal-form";
	}

	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg save(Terminal param) {
		JsonMsg json = new JsonMsg();
		if (null == param) {
			json.setSuccess(false);
			json.setMsg("保存失败,信息不完整或输入有误！");
		} else {
			terminalService.save(param);
			json.setSuccess(true);
			json.setMsg("保存成功!");
		}
		return json;
	}
	

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(String id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			terminalService.del(id);
		}
		json.setSuccess(true);
		json.setMsg("删除成功！");
		return json;
	}
	
	/**
	 * 日期型数据转换，将页面上的表示日期限的字符串，转换为Date型
	 * **//*
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd");
		dateFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));

	}*/


}
