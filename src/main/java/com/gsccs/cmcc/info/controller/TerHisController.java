package com.gsccs.cmcc.info.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
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

import com.gsccs.cmcc.info.model.Terminal;
import com.gsccs.cmcc.info.model.TerminalHis;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.TerminalService;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 终端变更记录管理
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/terhis")
public class TerHisController {

	
	@Autowired
	private MerchantService corpService;
	@Autowired
	private UserService userService;
	@Autowired
	private TerminalService terminalService;
	
	/**
	 * 终端清单
	 * 
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		return "terminal/terhis-list";
	}

	
	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " edittime desc  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows,  
			TerminalHis param,
			String parid,
			HttpServletRequest request) {
		if(StringUtils.isEmpty(parid)){
			param.setParid(parid);
		}
		List<TerminalHis> resultList = terminalService.find(param, order, page,rows);
		int count = terminalService.count(param);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(resultList);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	
	/**
	 * 终端变更表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id, String parid ,ModelMap map) {
		
		TerminalHis terminalHis = null;
		map.put("parid", parid);
		if (StringUtils.isNotEmpty(id)) {
			terminalHis = terminalService.getTerHis(id);
			map.put("terminalHis", terminalHis);
		}else{
		}
		//获得设备明细
		Terminal terminal = terminalService.get(parid);
		map.put("terminal", terminal);
				
		return "terminal/terhis-form";
		
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg save(TerminalHis param,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null == param) {
			json.setSuccess(false);
			json.setMsg("项目信息进度添加失败！");
		} else {
			terminalService.saveHis(param);
			json.setSuccess(true);
			json.setMsg("项目信息进度新增成功!");
		}
		return json;
	}
	

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(String id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			terminalService.delHis(id);
		}
		json.setSuccess(true);
		json.setMsg("项目进度信息删除成功！");
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
