package com.gsccs.cmcc.work.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.work.model.Contract;
import com.gsccs.cmcc.work.service.ContractService;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 合同管理
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractService contractService;
	
	@Autowired
	private DictService dictService;


	/**
	 * 合同列表
	 * 
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		return "projects/contract-list";
	}

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " ordernum  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, Contract param,
			HttpServletRequest request) {
		List<Contract> contactList = contractService.find(param, order, page, rows);
		int count = contractService.count(param);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(contactList);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	/**
	 * 合同表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id,Model model) {
		if(StringUtils.isNotEmpty(id)){
			Contract ct = contractService.get(id);
			model.addAttribute("contract",ct );
		}else{
			
		}
		return "projects/contract-form";
	}
	
	
	/**
	 * 保存合同信息，同时需要判断相关人员是否关注微信公众号并且完成认证
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg save(Contract param) {
		JsonMsg json = new JsonMsg();
		if (null != param) {
			if (StringUtils.isEmpty(param.getId())){
				contractService.add(param);
			}else{
				contractService.update(param);
			}
			json.setSuccess(true);
			json.setMsg("新增成功!");
		}else{
			json.setSuccess(false);
			json.setMsg("新增失败!");
		}
		return json;
	}


	/**
	 * 合同删除
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(String id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			contractService.del(id);
		}
		json.setSuccess(true);
		json.setMsg("删除成功！");
		return json;
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
