package com.gsccs.cmcc.info.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.info.model.Merchant;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.TradeVspService;
import com.gsccs.cmcc.info.service.OrderedService;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 企业信息
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/merchant")
public class MerchantController {

	@Autowired
	private MerchantService merchantService;
	
	@Autowired
	private OrderedService orderedService;
	
	@Autowired
	private TradeVspService tradeVspService;
	
	@Autowired
	private UserService userService;

	/**
	 * 商户信息列表
	 * 
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		List<User> userList = userService.findByRoleCode(Constants.ROLE_YY_AM);
		map.addAttribute("userList", userList);
		return "merchant/merchant-list";
	}

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " addtime desc  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			Merchant param,
			HttpServletRequest request) {
		List<Merchant> corpList = merchantService.findMchByAuth(param, order, page, rows);
		Integer count = merchantService.countByAuth(param);
		
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(corpList);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	/**
	 * 企业信息表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id, ModelMap map) {
		List<User> userList = userService.findByRoleCode(Constants.ROLE_YY_AM);
		map.addAttribute("userList", userList);
		if (null != id) {
			Merchant corp = merchantService.getCorp(id);
			map.put("merchant", corp);
			return "merchant/merchant-edit";
		}else{
			return "merchant/merchant-add";
		}
		
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(Merchant corp,HttpServletRequest request) {
		JsonMsg json = new JsonMsg();
		if (null != corp) {
			//如果没有userid.则set当前登录用户
			if(null == corp.getAmUserId()){
				Subject subject = SecurityUtils.getSubject();
				String username = (String)subject.getPrincipal();
				User user = userService.findByAccount(username);
				corp.setAmUserId(user.getId());
			}
			Subject subject = SecurityUtils.getSubject();
			String username = (String)subject.getPrincipal();
			User user = userService.findByAccount(username);
			
			if(null != corp.getId() && !corp.getId().equals("")){
				Merchant c = merchantService.getCorp(corp.getId());
				//判断集团编码是否重复
				if(c !=null){
					json.setSuccess(false);
					json.setMsg("集团编码重复,重新填写集团编码!");
				}else{     
					if(corp.getAmUserId()==null){
						corp.setAmUserId(user.getId());
					}
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
