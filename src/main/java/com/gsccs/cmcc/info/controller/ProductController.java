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

import com.gsccs.cmcc.info.service.ProductService;
import com.gsccs.cmcc.product.model.Product;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 信息化产品控制类
 * 
 * @author x.d zhang
 * 
 */

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		return "product/product-list";
	}

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " id ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, Product product,
			HttpServletRequest request) {
		List<Product> products = productService.find(product, order, page,
				rows);
		int count = productService.count(product);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(products);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id, ModelMap map) {
		Product product = null;
		if (StringUtils.isNotEmpty(id)) {
			product = productService.getProduct(id);
			map.put("product", product);
			return "product/product-edit";
		}else{
			return "product/product-add";
		}
		
	}

	/**
	 * 新增产品
	 * 
	 * @param landInfo
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(Product product, Model model) {
		JsonMsg json = new JsonMsg();
		if (null != product) {
			productService.addProduct(product);
		}
		json.setSuccess(true);
		json.setMsg("新增产品成功");
		return json;

	}

	/**
	 * 修改产品信息
	 * 
	 * @param landInfo
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(Product product,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != product) {
			productService.updateProduct(product);
		}
		json.setSuccess(true);
		json.setMsg("更新产品信息成功！");
		return json;
	}

	/**
	 * 删除产品信息
	 * 
	 * @param landInfo
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
			//for (String string : idarray) {
			productService.delProduct(ids);
			//}
			json.setSuccess(true);
			json.setMsg("删除产品信息成功！");
		} else {
			json.setSuccess(false);
			json.setMsg("删除失败:产品不存在。");
		}
		return json;
	}

}
