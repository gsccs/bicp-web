package com.gsccs.cmcc.bill.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.plat.auth.service.AreaService;
import com.gsccs.plat.bass.TreeGrid;

/**
 * 账单模板控制类
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/billtpl")
public class TempletController {

	@Autowired
	private MerchantService corpService;
	@Autowired
	private AreaService areaService;
	
	

	@RequestMapping(value = "/treegrid", method = RequestMethod.GET)
	public String treegrid(ModelMap map, HttpServletRequest request) {
		return "statist/area-tree";
	}

	
	@RequestMapping(value = "/treegrid", method = RequestMethod.POST)
	@ResponseBody
	public TreeGrid treegridData(ModelMap map,
			HttpServletRequest request) {
		TreeGrid treeGrid = new TreeGrid();
		
		JSONArray areaArray = new JSONArray();
		for(int i=1;i<=10;i++){
			JSONObject area_1 = new JSONObject();
			area_1.put("id", i);
			area_1.put("name", "地域"+i);
			
			JSONArray corpArray_1 = new JSONArray();
			for(int j=1;j<=5;j++){
				JSONObject corp_1 = new JSONObject();
				corp_1.put("id", "corp_"+i+"_"+j);
				corp_1.put("name", "corp_"+i+"_"+j);
				corpArray_1.add(corp_1);
			}
			area_1.put("children", corpArray_1);
			areaArray.add(area_1);
		}
		treeGrid.setRows(areaArray);
		return treeGrid;
	}

}
