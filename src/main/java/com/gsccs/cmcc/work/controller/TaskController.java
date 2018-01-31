package com.gsccs.cmcc.work.controller;

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

import com.gsccs.cmcc.work.model.Task;
import com.gsccs.cmcc.work.service.TaskService;
import com.gsccs.plat.auth.model.DictItemT;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;
import com.gsccs.plat.bass.QueryConstants;

/**
 * 集团通讯录联系方法
 * 
 * @author x.j niu
 * 
 */

@Controller
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@Autowired
	private DictService dictService;
	

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " id  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, 
			Task param,
			String pid,
			HttpServletRequest request) {
		if(StringUtils.isNotEmpty(pid)){
			param.setPid(pid);
		}
		List<Task> conwayList = taskService.find(param, order, page,
				rows);
		System.out.println("conwayList="+conwayList.size());
		int count = taskService.count(param);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(conwayList);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	/**
	 * 集团通讯录联系方式表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id, String cid ,ModelMap map) {
		
		Task task = null;
		
		//运营商
		List<DictItemT> ispList = dictService.getDictItems(QueryConstants.ISP_TYPE);
		map.addAttribute("ispList", ispList);
		map.put("cid", cid);
		if (StringUtils.isNotEmpty(id)) {
			task = taskService.get(id);
			map.put("task", task);
		}else{
		}
		return "projects/task-form";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(Task conway,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null == conway) {
			json.setSuccess(false);
			json.setMsg("集团通讯录联系方式添加失败！");
		} else {
			taskService.add(conway);
			json.setSuccess(true);
			json.setMsg("集团通讯录联系方式新增成功!");
		}
		return json;
	}
	

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(Task conway,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null == conway) {
			json.setSuccess(false);
			json.setMsg("集团通讯录联系方式更新失败！");
		} else {
			taskService.update(conway);
			json.setSuccess(true);
			json.setMsg("集团通讯录联系方式更新成功!");
		}
		return json;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(String id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			taskService.del(id);
			json.setSuccess(true);
			json.setMsg("集团通讯录联系方式删除成功！");
		}else{
			json.setSuccess(false);
			json.setMsg("集团通讯录联系方式删除成功！");
		}
		
		return json;
	}

}
