package com.gsccs.cmcc.wxmp.model;

import java.util.List;

/**
 * @author 刘杰
 *
 * @date 2016年9月24日
 */

public class WxMenus extends WxMenu {
	
	private List<WxMenu> subMenu;

	
	public List<WxMenu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<WxMenu> subMenu) {
		this.subMenu = subMenu;
	}
	
}

