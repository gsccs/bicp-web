package com.gsccs.cmcc.info.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.info.model.PropT;
import com.gsccs.cmcc.info.service.ProductService;
import com.gsccs.cmcc.info.service.PropService;
import com.gsccs.cmcc.product.model.Product;
import com.gsccs.plat.auth.model.DictGroupT;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 产品属性管理
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/prop")
public class PropController {

	@Autowired
	private ProductService productService;
	@Autowired
	private PropService propService;
	@Autowired
	private DictService dictService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(String productid, ModelMap map) {
		map.addAttribute("productid", productid);
		//获得产品列表
		Product pt = new Product();
		List<Product> ptList = productService.find(pt);
		map.addAttribute("ptList", ptList);
		return "product/prop-list";
	}

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(String productid, ModelMap map,
			@RequestParam(defaultValue = " indexnum ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows,
			HttpServletRequest request) {
		PropT propT = new PropT();
		if(null != productid && !productid.equals("null")){
			propT.setProductid(productid);
		}
		List<PropT> list = propService.find(propT, order, page,
				rows);
		int count = propService.count(propT);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String showCreateForm(String id, String productid, Model model) {
		PropT propT = null;
		
		//获得数据字典分类
		DictGroupT dgt = new DictGroupT();
		List<DictGroupT> dgtList = dictService.findGroupList(dgt);
		model.addAttribute("dgtList", dgtList);
		
		//产品id
		model.addAttribute("productid", productid);
		
		//获得产品列表
		/*ProductT pt = new ProductT();
		List<ProductT> ptList = productService.find(pt);
		model.addAttribute("ptList", ptList);*/
		if (StringUtils.isNotEmpty(id)) {
			propT = propService.getProp(id);
			model.addAttribute("prop", propT);
			return "product/prop-edit";
		}else{
			return "product/prop-add";
		}
		
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(PropT monitorType,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != monitorType) {
			propService.addProp(monitorType);
		}
		json.setSuccess(true);
		json.setMsg("新增成功");
		return json;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(PropT param, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != param) {
			propService.updateProp(param);
			json.setSuccess(true);
			json.setMsg("产品属性更新成功！");
		}else{
			json.setSuccess(false);
			json.setMsg("产品属性更新失败！");
		}
		
		return json;
	}

	/**
	 * 
	 * @param ids
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(
			@RequestParam(value = "ids", required = false) String ids,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(ids)) {
			//String[] idarray = ids.split(",");
			 propService.delProp(ids);
			json.setSuccess(true);
			json.setMsg("属性删除成功！");
			return json;
		}
		json.setSuccess(false);
		json.setMsg("属性删除失败！");
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
