package com.gsccs.cmcc.info.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.info.model.PropT;
import com.gsccs.cmcc.info.model.PropvalT;
import com.gsccs.cmcc.info.service.ProductService;
import com.gsccs.cmcc.info.service.PropService;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 产品属性值管理
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/propv")
public class PropVController {

	@Autowired
	private ProductService productService;
	@Autowired
	private PropService propService;
	@Autowired
	private DictService dictService;

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(PropvalT param, ModelMap map,
			@RequestParam(defaultValue = " indexnum ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows,
			HttpServletRequest request) {
		Datagrid datagrid = new Datagrid();
		if(null==param || null==param.getCorpid() || null==param.getProductid()){
			return datagrid;
		}
		List<PropvalT> list = propService.find(param, order, page, rows);
		int count = propService.count(param);
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg saveSuvery(@RequestBody List<PropvalT> propvlist) {
		JsonMsg json = new JsonMsg();
		if (null == propvlist || propvlist.size()<=0){
			json.setSuccess(false);
			json.setMsg("保存失败，无修改内容！");
		}
		propService.savePropvalList(propvlist);
		json.setSuccess(true);
		json.setMsg("保存成功！");
		return json;
	}
	

	@RequestMapping(value = "/list")
	@ResponseBody
	public JsonMsg proplist(String productid, ModelMap map,
			HttpServletRequest request) {
		JsonMsg jsonMsg = new JsonMsg();
		if (StringUtils.isEmpty(productid)) {
			jsonMsg.setSuccess(false);
			jsonMsg.setMsg("请指定信息化产品产品！");
			return jsonMsg;
		}

		PropT propT = new PropT();
		propT.setProductid(productid);
		List<PropT> proplist = propService.find(propT, "indexnum", 1,
				Integer.MAX_VALUE);
		jsonMsg.setSuccess(true);
		jsonMsg.setData(proplist);
		return jsonMsg;
	}
}
