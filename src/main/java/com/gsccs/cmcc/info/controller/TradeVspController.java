package com.gsccs.cmcc.info.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.data.model.TradeVsp;
import com.gsccs.cmcc.info.model.Merchant;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.TradeVspService;
import com.gsccs.plat.auth.model.DictItemT;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;
import com.gsccs.plat.bass.QueryConstants;

/**
 * 收银宝控制类
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/vsp")
public class TradeVspController {

	@Autowired
	private TradeVspService vspTradeService;
	@Autowired
	private MerchantService merchantService;
	@Autowired
	private DictService dictService;
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		return "trade/vsp-list";
	}

	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(Long id, ModelMap map) {
		TradeVsp speclineT = null;
		Merchant ct = new Merchant();
		
		List<Merchant> ctList = merchantService.find(ct);
		map.addAttribute("ctList", ctList);
		//获得运营商和专线类型,缴费方式
		List<DictItemT> ispList = dictService.getDictItems(QueryConstants.ISP_TYPE);
		if(null != ispList && ispList.size() > 0){
			map.addAttribute("ispList", ispList);
		}
		
		List<DictItemT> lineList = dictService.getDictItems(QueryConstants.SPECLINE_TYPE);
		if(null != lineList && lineList.size() > 0){
			map.addAttribute("lineList", lineList);
		}
		
		
		List<DictItemT> payList = dictService.getDictItems(QueryConstants.PAY_TYPE);
		if(null != payList && payList.size() > 0){
			map.addAttribute("payList", payList);
		}
		List<User> userList = userService.findByRoleCode(Constants.ROLE_YY_AM);
		map.addAttribute("userList", userList);
		if (null != id) {
			speclineT = vspTradeService.get(id);
			map.addAttribute("specline", speclineT);
			
			return "trade/vsp-edit";
		}else{
			return "trade/vsp-add";
		}
	}
	
	

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(TradeVsp param ,ModelMap map,
			@RequestParam(defaultValue = " id  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			HttpServletRequest request) {
		List<TradeVsp> list = vspTradeService.find(param, order, page, rows);
		int count = vspTradeService.count(param);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(TradeVsp specline,RedirectAttributes redirectAttributes
			) {
			JsonMsg json = new JsonMsg();
			if (null != specline) {
			/*boolean  isExist = speclineService.isExist(specline.getId());
			//ispcode存在
			if(isExist){
				json.setSuccess(false);
				json.setMsg("客户专线信息已经存在,不能重复添加,请重新选择企业!");
			}else{*/
				vspTradeService.add(specline);
				json.setSuccess(true);
				json.setMsg("专线信息保存成功！");
			//}
			
		}else{
			json.setSuccess(false);
			json.setMsg("专线信息保存失败！");
		}
		return json;

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(TradeVsp specline,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != specline) {
			vspTradeService.update(specline);
			json.setSuccess(true);
			json.setMsg("专线信息更新成功！");
		}else{
			json.setSuccess(false);
			json.setMsg("专线信息更新失败！");
		}
		
		return json;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(Long id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != id) {
			vspTradeService.del(id);
		}
		json.setSuccess(true);
		json.setMsg("专线信息删除成功！");
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
