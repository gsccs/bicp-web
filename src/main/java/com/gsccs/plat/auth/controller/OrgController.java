package com.gsccs.plat.auth.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSONArray;
import com.gsccs.plat.auth.model.Organization;
import com.gsccs.plat.auth.service.OrganizationService;
import com.gsccs.plat.bass.CtreeGrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 组织机构管理
 * 
 * @author x.d zhang
 * 
 */
@Controller
@RequestMapping("/org")
public class OrgController {

	@Autowired
	private OrganizationService organizationService;

	@RequiresPermissions("org:view")
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "auth/org-list";
	}

	@RequiresPermissions("org:view")
	@RequestMapping(value = "/treegrid", method = RequestMethod.POST)
	@ResponseBody
	public List<CtreeGrid> treegrid(Organization org, Model model) {
		List<Organization> orglist = organizationService.findAll();
		// treegrid.setRows(organizationService.getOrgTreeToJson());
		List<CtreeGrid> tgList = new ArrayList<CtreeGrid>();
		for (Organization tg : orglist) {
			CtreeGrid ctg = new CtreeGrid();
			ctg.setId(tg.getId().toString());
			ctg.setParentId(tg.getParentId().toString());
			ctg.setText(tg.getName());
			ctg.setIconCls("icon-file");
			/*
			 * if(categoryService.hasChildren(tg.getId())){
			 * ctg.setState("closed"); }
			 */
			tgList.add(ctg);
		}
		return tgList;
	}

	@RequiresPermissions("org:view")
	@RequestMapping(value = "/tree", method = RequestMethod.POST)
	@ResponseBody
	public JSONArray tree(Model model) {
		return organizationService.findOrgTree();
	}

	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(Long parentId, Long id, Model model) {
		Organization org = null;
		if (null == id) { // 新增组织机构
			if (null == parentId) { // 增加根节点
				org = new Organization();
				org.setParentId(1l);
			} else { // 增加子节点
				org = new Organization();
				org.setParentId(parentId);
			}
		} else { // 修改组织机构
			org = organizationService.findOne(id);
		}
		model.addAttribute("org", org);
		return "auth/org-edit";
	}

	@RequiresPermissions("org:create")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(Organization organization) {
		JsonMsg json = new JsonMsg();
		organizationService.createOrganization(organization);
		json.setSuccess(true);
		json.setMsg("新增成功！");
		return json;
	}

	@RequiresPermissions("org:update")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(Organization organization,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		organizationService.updateOrganization(organization);
		json.setSuccess(true);
		json.setMsg("修改成功！");
		return json;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(Long id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		organizationService.deleteOrganization(id);
		json.setSuccess(true);
		json.setMsg("删除成功！");
		return json;
	}

}
