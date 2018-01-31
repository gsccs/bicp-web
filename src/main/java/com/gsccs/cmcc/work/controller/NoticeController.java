package com.gsccs.cmcc.work.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.cmcc.work.model.WorkNotice;
import com.gsccs.cmcc.work.service.PlanService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;


/**
 * 公告通知
 * @author x.d zhang
 *
 */
@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

	@Autowired
	private PlanService workService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	protected String getDkyyList(HttpServletRequest req) {
		return "work/notice-list";
	}

	@RequestMapping(value = "/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid getDkyyList(WorkNotice param,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows,
			@RequestParam(defaultValue = "") String orderstr,
			HttpServletRequest request, ModelMap map) {

		Datagrid grid = new Datagrid();
		List<WorkNotice> list = workService.find(param, orderstr, page, rows);
		int count = workService.count(param);
		grid.setRows(list);
		grid.setTotal(Long.valueOf(count));
		return grid;
	}
	
	
	/**
	 * 加载通知公告
	 * @param id
	 * @param request
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/noticeInfo", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg getNoticeInfo(String id,
			HttpServletRequest request, ModelMap map) {
		JsonMsg json = new JsonMsg();
		WorkNotice worknotice = workService.getNotice(id);
		if (null != worknotice){
			json.setSuccess(true);
			json.setData(worknotice);
		}else{
			json.setSuccess(false);
			json.setMsg("通知公告不存在");
		}
		return json;
	}

	// 新增
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showCreateForm(Model model, String id) {
		model.addAttribute("op", "新增");
		return "work/notice-edit";
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(WorkNotice worknotice, RedirectAttributes redirectAttributes) {
		if (null != worknotice) {
			workService.add(worknotice);
		}
		JsonMsg msg = new JsonMsg();
		msg.setSuccess(true);
		msg.setMsg("记录添加成功!");
		return msg;
	}

	// 修改
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String showUpdateForm(String id, Model model) {
		if (null != id && id.trim().length() > 0) {
			WorkNotice worknotice = workService.getNotice(id);
			model.addAttribute("worknotice", worknotice);
		}
		model.addAttribute("op", "修改");
		return "work/notice-edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(WorkNotice worknotice, RedirectAttributes redirectAttributes) {
		JsonMsg msg = new JsonMsg();
		if (null != worknotice) {
			workService.update(worknotice);
			msg.setSuccess(true);
			msg.setMsg("信息修改成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("信息修改失败!");
		}
		return msg;
	}

	// 删除
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public JsonMsg del(String id, HttpServletRequest request) {
		JsonMsg msg = new JsonMsg();
		if (null != id) {
			workService.deletePlan(id);
			msg.setSuccess(true);
			msg.setMsg("记录删除成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("记录删除失败!");
		}
		return msg;
	}
}
