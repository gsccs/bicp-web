package com.gsccs.cmcc.wxmp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.wxmp.model.WxMenu;
import com.gsccs.cmcc.wxmp.model.WxMenus;
import com.gsccs.cmcc.wxmp.service.WxAppService;
import com.gsccs.cmcc.wxmp.service.WxMenuService;
import com.gsccs.plat.bass.JsonMsg;

/**
 * @author x.d zhang
 * 
 * @date 2016年9月22日
 */
@Controller
@RequestMapping(value="/wxmenu")
public class WxMenuController {

	@Autowired
	private WxMenuService wxMenuService;
	@Autowired
	private WxAppService wxAppService;
	//WxMpConfigStorage wxMpConfigStorage;

	// 获取列表
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String getMenuList(@PathVariable("appid") String appid,ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		// 获取所有一级栏目
		List<WxMenu> wxOneMenus = wxMenuService.find(appid,"order_num");
		// 拼成数据结构为(WxMenu,List<WxMenu>)的List
		List<WxMenus> wxMenusList = new ArrayList<>();
		for (WxMenu wxMenu : wxOneMenus) {
			WxMenus wxMenus = new WxMenus();
			BeanUtils.copyProperties(wxMenu, wxMenus);
			List<WxMenu> subMenu = wxMenuService.find(appid,
					wxMenu.getId(), "order_num");
			wxMenus.setSubMenu(subMenu);
			wxMenusList.add(wxMenus);
		}
		map.put("list", wxMenusList);
		return "weixin/menu_list";
	}

	// 编辑
	@RequestMapping(value = "/menuEdit", method = RequestMethod.POST)
	public String edit(String id, String type, String parId, String title,
			String url, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		WxMenu model = new WxMenu();
		if ("addSon" == type) {
			model.setParId(id);
		} else {
			model.setParId(parId);
			if (StringUtils.isEmpty(id)) {

			} else {
				model = wxMenuService.findById(id);
			}
		}
		map.put("model", model);
		return "weixin/menu_edit";
	}

	// 保存
	@RequestMapping(value = "/menuSave", method = RequestMethod.POST)
	public String save(@PathVariable("appid") String appid,ModelMap map, WxMenu model, HttpServletRequest request,
			HttpServletResponse response) {
		if (StringUtils.isEmpty(model.getId())) {
			model.setId(UUID.randomUUID().toString());
			model.setAppId(appid);
			wxMenuService.add(model);
		} else {
			model.setAppId(appid);
			wxMenuService.update(model);
		}
		return "admin/msg";
	}

	// 删除
	@RequestMapping(value = "/menuDel", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg del(String id, ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(id)) {
			wxMenuService.del(id);
			json.setSuccess(true);
			json.setMsg("新增成功!");
		} else {
			json.setSuccess(false);
			json.setMsg("删除失败！");
		}
		return json;
	}

	// 获取子菜单
	@RequestMapping(value = "/menuSon", method = RequestMethod.POST)
	public String getMenuSon(String appid, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		if (StringUtils.isNotEmpty(appid)) {
			List<WxMenu> wxMenus = wxMenuService.find(appid, "order_num");
			map.put("list", wxMenus);
		}
		return "weixin/menu_son";
	}

	/**
	 * 微信菜单项发布
	 * 
	 * @return
	 */
	@RequestMapping(value = "/menuSend", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg deployMenu(
			@RequestParam(value = "appid", required = true) String appid,
			ModelMap map) {
		JsonMsg json = new JsonMsg();
		List<WxMenuButton> buttons = new ArrayList<WxMenuButton>();
		List<WxMenu> menuList = wxMenuService.find(appid, "order_num");
		if (null != menuList && menuList.size() > 0) {
			for (WxMenu t : menuList) {
				WxMenuButton but = new WxMenuButton();
				List<WxMenuButton> subbuttons = new ArrayList<WxMenuButton>();
				List<WxMenu> submenuList = wxMenuService.find(appid, t.getId(),
						null);
				for (WxMenu st : submenuList) {
					WxMenuButton subbut = new WxMenuButton();
					subbut.setKey(st.getKey());
					subbut.setName(st.getName());
					subbut.setType(st.getType());
					subbut.setUrl(st.getUrl());
					subbuttons.add(subbut);
				}
				but.setKey(t.getKey());
				but.setName(t.getName());
				but.setType(t.getType());
				but.setUrl(t.getUrl());
				but.setSubButtons(subbuttons);
				buttons.add(but);
			}
			
			me.chanjar.weixin.common.bean.menu.WxMenu wxMenu = new me.chanjar.weixin.common.bean.menu.WxMenu();
			
			//WxMenu wxmenu = new WxMenu();
			wxMenu.setButtons(buttons);

			try {
				System.out.println(appid);
				WxMpConfigStorage wxMpConfigStorage = wxAppService.getMpConfig(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
				wxMpService.getAccessToken(true);
				wxMpService.getMenuService().menuCreate(wxMenu);
			} catch (WxErrorException e) {
				e.printStackTrace();
			}
		}
		json.setSuccess(true);
		json.setMsg("通讯录删除成功！");
		return json;
	}

}
