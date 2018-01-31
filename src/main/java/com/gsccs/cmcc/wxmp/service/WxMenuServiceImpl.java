package com.gsccs.cmcc.wxmp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.wxmp.dao.WxMenuMapper;
import com.gsccs.cmcc.wxmp.model.WxMenu;
import com.gsccs.cmcc.wxmp.model.WxMenuExample;

@Service
public class WxMenuServiceImpl implements WxMenuService {

	@Autowired
	private WxMenuMapper wxMenuMapper;

	@Override
	public List<WxMenu> find(String appid, String order) {
		WxMenuExample example = new WxMenuExample();
		WxMenuExample.Criteria criteria = example.createCriteria();
		criteria.andAppIdEqualTo(appid);
		criteria.andParIdEqualTo("");
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return wxMenuMapper.selectByExample(example);
	}

	@Override
	public WxMenu findById(String id) {
		return wxMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(WxMenu brands) {
		wxMenuMapper.updateByPrimaryKey(brands);
	}

	@Override
	public int add(WxMenu brands) {
		return wxMenuMapper.insert(brands);
	}

	@Override
	public void del(String id) {
		wxMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<WxMenu> find(String appid, String parId, String order) {
		WxMenuExample example = new WxMenuExample();
		WxMenuExample.Criteria criteria = example.createCriteria();
		criteria.andAppIdEqualTo(appid);
		criteria.andParIdEqualTo(parId);
		if (order != null && order.trim().length() > 0) {
			example.setOrderByClause(order);
		}
		return wxMenuMapper.selectByExample(example);
	}

}
