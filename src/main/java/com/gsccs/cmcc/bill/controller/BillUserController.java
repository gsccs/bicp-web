package com.gsccs.cmcc.bill.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.bill.model.BillItem;
import com.gsccs.cmcc.bill.model.BillSum;
import com.gsccs.cmcc.bill.service.BillService;
import com.gsccs.plat.bass.Datagrid;

/**
 * 用户帐单
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/billqy")
public class BillUserController {

	@Autowired
	private BillService billService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String tplList(ModelMap map, HttpServletRequest request) {
		return "bill/sum-list";
	}
	
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String tplForm(String id,ModelMap map) {
		BillSum billSum = billService.getBillSum(id);
		BillItem queryItem = new BillItem();
		queryItem.setBillid(id);
		List<BillItem> itemList = billService.find(queryItem, "", 1, Integer.MAX_VALUE);
		billSum.setItemList(itemList);
		map.put("billSum", billSum);
		return "bill/sum-form";
	}
	
	
	@RequestMapping(value = "/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid datagrid(BillSum param,ModelMap map,
			@RequestParam(defaultValue = " ordernum  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			HttpServletRequest request) {
		Datagrid datagrid = new Datagrid();
		List<BillSum> list = billService.find(param, order, page, rows);
		int count = billService.count(param);
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}
	

}
