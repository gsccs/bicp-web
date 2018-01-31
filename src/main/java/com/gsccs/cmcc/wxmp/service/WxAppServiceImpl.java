package com.gsccs.cmcc.wxmp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.wxmp.dao.WxAppMapper;
import com.gsccs.cmcc.wxmp.model.WxApp;
import com.gsccs.cmcc.wxmp.model.WxAppExample;
import com.gsccs.cmcc.wxmp.model.WxAppExample.Criteria;

@Service(value = "wxAppService")
public class WxAppServiceImpl implements WxAppService {

	private static Map<String,WxMpInDBConfigStorage> configCache = new HashMap<String,WxMpInDBConfigStorage>();
	@Autowired
	private WxAppMapper wxAppMapper;

	@Override
	public List<WxApp> find(WxApp param, String order, int currPage,
			int pageSize, boolean iscache) {
		WxAppExample example = new WxAppExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return wxAppMapper.selectPageByExample(example);
	}

	@Override
	public int count(WxApp brands) {
		WxAppExample example = new WxAppExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(brands, criteria);
		return wxAppMapper.countByExample(example);
	}

	@Override
	public List<WxApp> find(WxApp param, String order) {
		WxAppExample example = new WxAppExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		return wxAppMapper.selectByExample(example);
	}

	@Override
	public WxApp findById(String id) {
		return wxAppMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(WxApp wxApp) {
		wxAppMapper.updateByPrimaryKey(wxApp);
	}

	@Override
	public void add(WxApp param) {
		if (null == param) {
			return;
		}
		wxAppMapper.insert(param);
	}

	@Override
	public void del(String id) {
		wxAppMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 处理查询条件
	 * 
	 * @param info
	 * @param criteria
	 */
	public void proSearchParam(WxApp param, WxAppExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}

			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%" + param.getTitle() + "%");
			}

			if (StringUtils.isNotEmpty(param.getStatus())) {
				criteria.andStatusEqualTo(param.getStatus());
			}
		}
	}

	@Override
	public WxMpInDBConfigStorage getMpConfig(String appid) {
		if (configCache.containsKey(appid)){
			return configCache.get(appid);
		}else{
			WxApp wxApp = wxAppMapper.selectByPrimaryKey(appid);
			if (null != wxApp){
				WxMpInDBConfigStorage configStorage = new WxMpInDBConfigStorage();
				configStorage.appId = appid;
				configStorage.setSecret(wxApp.getSecret());
				configStorage.setToken(wxApp.getToken());
				configStorage.setAesKey(wxApp.getAesKey());
				configCache.put(appid, configStorage);
				return configStorage;
			}
		}
		return null;
	}

}
