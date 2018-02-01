package com.gsccs.cmcc.bill.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.bill.model.BillTpl;
import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.service.BillService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 账单模板控制类
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/billtpl")
public class BillTplController {

	@Autowired
	private BillService billService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String tplList(ModelMap map, HttpServletRequest request) {
		return "bill/templet-list";
	}
	
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String tplForm(String id,ModelMap map) {
		if (StringUtils.isNotEmpty(id)){
			BillTpl billTpl = billService.getBillTpl(id);
			map.put("billTpl", billTpl);
		}
		return "bill/templet-form";
	}
	
	@RequestMapping(value = "/addkm", method = RequestMethod.GET)
	public String addkmForm(String id,ModelMap map) {
		Subject querykm = new Subject();
		List<Subject> list = billService.find(querykm, "", 1, Integer.MAX_VALUE);
		map.put("kmList", list);
		return "bill/templet-kmform";
	}
	
	
	@RequestMapping(value = "/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid datagrid(BillTpl param,ModelMap map,
			@RequestParam(defaultValue = "") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			HttpServletRequest request) {
		Datagrid datagrid = new Datagrid();
		List<BillTpl> list = billService.find(param, order, page, rows);
		int count = billService.count(param);
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}
	
	/**
	 * 模板科目查询
	 * @param param
	 * @param map
	 * @param order
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value = "/tplkmdg", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid tplkmdg(String tplid,ModelMap map,
			@RequestParam(defaultValue = " ordernum  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows) {
		Datagrid datagrid = new Datagrid();
		String kmids = billService.getBillTpl(tplid).getKmids();
		List<Subject> list = billService.find(kmids);
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(list.size()));
		return datagrid;
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg save(BillTpl param, HttpServletRequest request) {
		JsonMsg msg = new JsonMsg();
		if (null != param) {
			billService.saveBillTpl(param);
			msg.setSuccess(true);
			msg.setMsg("保存成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("保存失败!");
		}
		return msg;
	}

}
