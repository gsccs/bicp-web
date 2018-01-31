package com.gsccs.cmcc.info.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.info.model.Merchant;
import com.gsccs.cmcc.info.model.Ordered;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.OrderedService;
import com.gsccs.cmcc.info.service.ProductService;
import com.gsccs.cmcc.product.model.Product;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 订购关系管理
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/ordered")
public class OrderedController {

	@Autowired
	private MerchantService merchantService;
	
	@Autowired
	private OrderedService orderedService;
	
	@Autowired
	private ProductService productService;

	/**
	 * 客户信息列表
	 * 
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		//List<User> userList = userService.findByRoleCode(Constants.ROLE_YY_AM);
		//map.addAttribute("userList", userList);
		return "merchant/ordered-list";
	}

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " addtime desc  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			Ordered param,
			HttpServletRequest request) {
		List<Ordered> list = orderedService.find(param, order, page, rows);
		Integer count = orderedService.count(param);
		
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	/**
	 * 订购表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id, ModelMap map) {
		
		List<Product> productList = productService.find(null);
		map.put("productList", productList);
		if (null != id) {
			Merchant corp = merchantService.getCorp(id);
			map.put("merchant", corp);
			return "merchant/ordered-edit";
		}else{
			return "merchant/ordered-add";
		}
		
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(Merchant corp,HttpServletRequest request) {
		JsonMsg json = new JsonMsg();
		if (null != corp) {
			
			if(null != corp.getId() && !corp.getId().equals("")){
				Merchant c = merchantService.getCorp(corp.getId());
				//判断集团编码是否重复
				if(c !=null){
					json.setSuccess(false);
					json.setMsg("集团编码重复,重新填写集团编码!");
				}else{     
					merchantService.addCorp(corp);
					json.setSuccess(true);
					json.setMsg("企业信息新增成功!");
				}
			}else{
				merchantService.addCorp(corp);
				json.setSuccess(true);
				json.setMsg("企业信息新增成功!");
			}
			
		}else{
			json.setSuccess(false);
			json.setMsg("企业信息新增失败!");
		}
		
		return json;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(Merchant corp,
			HttpServletRequest request) {
		JsonMsg json = new JsonMsg();
		if (null != corp) {
			merchantService.updateCorp(corp);
		}
		json.setSuccess(true);
		json.setMsg("更新企业信息成功！");
		return json;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(String id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			merchantService.delCorp(id);
			json.setSuccess(true);
			json.setMsg("企业信息删除成功！");
		}else{
			json.setSuccess(false);
			json.setMsg("企业信息删除失败！");
		}
		
		return json;
	}

	
}
