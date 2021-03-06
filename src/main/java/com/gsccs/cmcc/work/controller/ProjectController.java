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

import com.gsccs.cmcc.info.service.MerchantService;
import com.gsccs.cmcc.work.model.Project;
import com.gsccs.cmcc.work.service.ProjectService;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 项目管理
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private MerchantService merchantService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private DictService dictService;


	/**
	 * 通讯录列表
	 * 
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap map, HttpServletRequest request) {
		
		return "projects/project-list";
	}

	@RequestMapping(value = "/datagrid")
	@ResponseBody
	public Datagrid list(ModelMap map,
			@RequestParam(defaultValue = " ordernum  ") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows, Project contact,
			HttpServletRequest request) {
		List<Project> contactList = projectService.find(contact, order, page, rows);
		int count = projectService.count(contact);
		Datagrid datagrid = new Datagrid();
		datagrid.setRows(contactList);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	/**
	 * 通讯录信息表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(String id,Model model) {
		if(id != null && !id.equals("")){
			Project ct = projectService.get(id);
			model.addAttribute("project",ct );
		}else{
			
		}
		return "projects/project-form";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg save(Project param,HttpServletRequest request) {
		JsonMsg json = new JsonMsg();
		if (null != param) {
			if (StringUtils.isEmpty(param.getId())){
				projectService.add(param);
			}else{
				projectService.update(param);
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
	 * 通讯录删除
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(String id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			projectService.del(id);
		}
		json.setSuccess(true);
		json.setMsg("通讯录删除成功！");
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
