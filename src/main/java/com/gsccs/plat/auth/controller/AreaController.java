package com.gsccs.plat.auth.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.gsccs.plat.auth.model.AreaT;
import com.gsccs.plat.auth.service.AreaService;

/**
 * 地域管理
 * 
 */
@Controller
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@RequiresPermissions("area:view")
	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		return "logist/area_list";
	}
	
	@RequestMapping(value = "/tree", method = RequestMethod.POST)
	@ResponseBody
	public JSONArray tree(Model model) {
		JSONArray areaTree = areaService.findAreaTree();
		return areaTree;
	}

}
