package com.gsccs.cmcc.process.controller;

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

import com.gsccs.cmcc.process.model.Define;
import com.gsccs.cmcc.process.model.Node;
import com.gsccs.cmcc.process.service.ProcessService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;


/**
 * 流程流转管理
 * @author x.d zhang
 *
 */
@Controller
@RequestMapping(value = "/trace")
public class TraceController {

	@Autowired
	private ProcessService processService;

	@RequestMapping(value="/def",method = RequestMethod.GET)
	protected String getDefList(HttpServletRequest req) {
		return "process/def-list";
	}
	
	@RequestMapping(value="/node",method = RequestMethod.GET)
	protected String getNodeList(HttpServletRequest req) {
		return "process/node-list";
	}

	@RequestMapping(value = "/def/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid getDefList(Define param,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows,
			@RequestParam(defaultValue = "") String orderstr,
			HttpServletRequest request, ModelMap map) {
		Datagrid grid = new Datagrid();
		List<Define> list = processService.find(param, orderstr, page, rows);
		int count = processService.count(param);
		grid.setRows(list);
		grid.setTotal(Long.valueOf(count));
		return grid;
	}
	
	@RequestMapping(value = "/node/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid getNodeList(
			String defid,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int rows,
			ModelMap map) {
		Datagrid grid = new Datagrid();
		Node param = new Node();
		param.setDefid(defid);
		List<Node> list = processService.find(param, "ordernum", page, rows);
		int count = processService.count(param);
		grid.setRows(list);
		grid.setTotal(Long.valueOf(count));
		return grid;
	}

	
	/**
	 * 加载流程定义
	 * @param id
	 * @param request
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/def/data", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg getProcessDef(String id,ModelMap map) {
		JsonMsg json = new JsonMsg();
		Define define = processService.getProcessDef(id);
		if (null != define){
			Node queryparam= new Node();
			queryparam.setDefid(id);
			List<Node> nodeList = processService.find(queryparam, "ordernum", 1, Integer.MAX_VALUE);
			define.setNodeList(nodeList);
			json.setSuccess(true);
			json.setData(define);
		}else{
			json.setSuccess(false);
			json.setMsg("流程定义不存在！");
		}
		return json;
	}


	// 修改
	@RequestMapping(value = "/def/dataform", method = RequestMethod.GET)
	public String showDefForm(String id, Model model) {
		if (null != id && id.trim().length() > 0) {
			Define processdef = processService.getProcessDef(id);
			model.addAttribute("processdef", processdef);
		}
		return "process/def-form";
	}
	
	// 修改
	@RequestMapping(value = "/node/dataform", method = RequestMethod.GET)
	public String showNodeForm(Integer id,String defid, Model model) {
		if (null != id) {
			Node node = processService.getProcessNode(id);
			model.addAttribute("processnode", node);
		}
		model.addAttribute("defid", defid);
		return "process/node-form";
	}

	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(Define param, RedirectAttributes redirectAttributes) {
		JsonMsg msg = new JsonMsg();
		if (null != param) {
			processService.updateProcessDef(param);
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
			processService.deleteProcessDef(id);
			msg.setSuccess(true);
			msg.setMsg("记录删除成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("记录删除失败!");
		}
		return msg;
	}
}
