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

import com.gsccs.cmcc.info.model.Terminal;
import com.gsccs.cmcc.info.model.TerminalHis;
import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.info.service.TerminalService;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 设备归还管理
 * @author x.d zhang
 *
 */
@Controller
@RequestMapping("/terrevert")
public class RevertController {
	
	@Autowired
	private TerminalService terminalService;
	@Autowired
	private MerchantService merchantService;
	@Autowired
	private UserService userService;
	
	
	
	/**
	 * 借用记录列表
	 * @param map
	 * @param order
	 * @param page
	 * @param rows
	 * @param param
	 * @param tersn
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " id  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "15") int rows,  TerminalHis param,
			String tersn,
			HttpServletRequest request) {
		Datagrid datagrid = new Datagrid();
		param.setParid(tersn);
		List<TerminalHis> list = terminalService.find(param, order, page,
				rows);
		int count = terminalService.count(param);
		datagrid.setRows(list);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}
	
	
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String showDataForm(String id,String parid,  ModelMap map) {
		TerminalHis terminalHis = terminalService.getTerHis(id);
		map.put("terminalHis", terminalHis);
		
		//获得设备明细
		Terminal terminal = terminalService.get(parid);
		map.put("terminal", terminal);
		
		//获得人员列表
		List<User> userList = userService.findAll();
		map.put("userList", userList);

		return "terminal/revert-form";
	}

	/**
	 * 修改借用记录
	 * @param recomd
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(TerminalHis param,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != param) {
			terminalService.saveHis(param);
			json.setSuccess(true);
			json.setMsg("更新日常上报推荐信息成功！");
		}else{
			json.setSuccess(false);
			json.setMsg("更新日常上报推荐信息失败！");
		}
		return json;
	}

	/**
	 * 删除借用记录
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
		System.out.println("ids="+ids);
		if (StringUtils.isNotEmpty(ids)) {
			terminalService.delHis(ids);
			json.setSuccess(true);
			json.setMsg("删除走访推荐信息成功！");
		} else {
			json.setSuccess(false);
			json.setMsg("删除失败:走访推荐信息不存在。");
		}
		return json;
	}
	
}
