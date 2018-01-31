package com.gsccs.cmcc.info.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.ProductService;
import com.gsccs.cmcc.info.service.PropService;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;

/**
 * 收单控制类
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/report")
public class ReportController {
	@Autowired
	private MerchantService corpService;
	@Autowired
	private ProductService productService;
	@Autowired
	private PropService propService;
	@Autowired
	private UserService userService;
	
	
	/**
	 * 收单交易流水
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(String id, ModelMap map) {
		List<User> userList = userService.findByRoleCode(Constants.ROLE_YY_AM);
		map.addAttribute("userList", userList);
		return "trade/sd-list";
	}

	
	
	
	/**
	 * 日期型数据转换，将页面上的表示日期限的字符串，转换为Date型
	 * **/
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd");
		dateFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));

	}
}
