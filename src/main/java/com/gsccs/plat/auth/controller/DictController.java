package com.gsccs.plat.auth.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gsccs.plat.auth.model.DictGroupT;
import com.gsccs.plat.auth.model.DictItemT;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 数据字典控制类
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/dict")
public class DictController {

	@Autowired
	private DictService dictService;
	
	@RequestMapping(method = RequestMethod.GET)
	protected String dict(HttpServletRequest req) {
		return "auth/dict-list";
	}
	
	@RequestMapping(value = "/item/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid dictItemList(Integer groupid, HttpServletRequest request,
			ModelMap map) {
		Datagrid grid = new Datagrid();
		DictItemT param = new DictItemT();
		param.setGroupid(groupid);
		List<DictItemT> list = dictService.findItemList(param);
		int count = dictService.countDictItem(param);
		grid.setRows(list);
		grid.setTotal(Long.valueOf(count));
		return grid;
	}

	// 新增
	@RequestMapping(value = "/item/form", method = RequestMethod.GET)
	public String dictItemForm(Integer id,Integer groupid,Model model) {
		DictItemT dictItem = null;
		if (null != id) {
			dictItem = dictService.getDictById(id);
		}
		if (null==groupid){
			groupid = dictItem.getGroupid();
		}
		DictGroupT dictGroup = dictService.getGroupById(groupid);
		model.addAttribute("dictItem", dictItem);
		model.addAttribute("dictGroup", dictGroup);
		return "auth/dictItem-form";
	}

	@RequestMapping(value = "/item/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg itemSave(DictItemT dictItem) {
		JsonMsg msg = new JsonMsg();
		if (null == dictItem) {
			msg.setSuccess(false);
			msg.setMsg("添加失败，数据有误！");
			return msg;
		}
		if (null==dictItem.getId()){
			dictService.addDictItem(dictItem);
		}else{
			dictService.updateDictItemT(dictItem);
		}
		msg.setSuccess(true);
		msg.setMsg("保存成功!");
		return msg;
	}

	// 删除
	@RequestMapping(value = "/item/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delDictitem(Integer id, HttpServletRequest request) {
		JsonMsg msg = new JsonMsg();
		if (null != id) {
			dictService.deleteDictItemT(id);
			msg.setSuccess(true);
			msg.setMsg("记录删除成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("记录删除失败!");
		}
		return msg;
	}

	@RequestMapping(value = "/group/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid dictGroupList(DictGroupT dictGroup,
			HttpServletRequest request, ModelMap map) {
		Datagrid grid = new Datagrid();
		List<DictGroupT> list = dictService.findGroupList(dictGroup);
		int count = dictService.countDictGroup(dictGroup);
		grid.setRows(list);
		grid.setTotal(Long.valueOf(count));
		return grid;
	}

	// 新增
	@RequestMapping(value = "/group/form", method = RequestMethod.GET)
	public String groupForm(Model model, Integer id) {
		DictGroupT dictGroup = null;
		if(null != id){
			dictGroup = dictService.getGroupById(id);
		}
		model.addAttribute("dictGroup", dictGroup);
		return "auth/dictGroup-form";
	}

	@RequestMapping(value = "/group/save", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(DictGroupT dictGroup,
			RedirectAttributes redirectAttributes) {
		JsonMsg msg = new JsonMsg();
		if (null == dictGroup) {
			msg.setSuccess(false);
			msg.setMsg("添加失败，数据有误");
			return msg;
		}
		
		if(null==dictGroup.getId()){
			DictGroupT dictGroupT = dictService.getGroupByCode(dictGroup.getCode());
			if (null != dictGroupT){
				msg.setSuccess(false);
				msg.setMsg("添加失败，编码重复");
				return msg;
			}
			dictService.addDictGroup(dictGroup);
		}else{
			dictService.updateDictGroupT(dictGroup);
		}
		msg.setSuccess(true);
		msg.setMsg("保存成功!");
		return msg;
	}

	// 删除
	@RequestMapping(value = "/group/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg del(Integer id, HttpServletRequest request) {
		JsonMsg msg = new JsonMsg();
		if (null != id) {
			dictService.deleteDictGroupT(id);
			msg.setSuccess(true);
			msg.setMsg("记录删除成功!");
		} else {
			msg.setSuccess(false);
			msg.setMsg("记录删除失败!");
		}
		return msg;
	}
}
