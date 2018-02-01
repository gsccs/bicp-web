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

import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.service.BillService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 账单科目控制类
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/billkm")
public class SubjectController {

	@Autowired
	private BillService billService;

	@RequestMapping(method = RequestMethod.GET)
	public String treegrid(ModelMap map, HttpServletRequest request) {
		return "bill/subject-list";
	}
	
	@RequestMapping(value="/dataform",method = RequestMethod.GET)
	protected String getSubjectForm(Integer id,ModelMap map) {
		if (null != id){
			Subject subject = billService.getSubject(id);
			map.put("billKm", subject);
		}
		return "bill/subject-form";
	}
	
	
	@RequestMapping(value = "/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid subjectList(Subject param,ModelMap map,
			@RequestParam(defaultValue = " ordernum  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			HttpServletRequest request) {
		Datagrid datagrid = new Datagrid();
		List<Subject> list = billService.find(param, order, page, rows);
		int count = billService.count(param);
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg save(Subject param, HttpServletRequest request) {
		JsonMsg msg = new JsonMsg();
		if (null != param) {
			billService.saveSubject(param);
			msg.setSuccess(true);
			msg.setMsg("保存成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("保存失败!");
		}
		return msg;
	}

	// 删除
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg del(Integer id, HttpServletRequest request) {
		JsonMsg msg = new JsonMsg();
		if (null != id) {
			billService.delSubject(id);
			msg.setSuccess(true);
			msg.setMsg("删除成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("删除失败!");
		}
		return msg;
	}

}
