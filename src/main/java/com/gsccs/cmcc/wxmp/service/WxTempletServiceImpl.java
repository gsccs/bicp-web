package com.gsccs.cmcc.wxmp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.wxmp.dao.WxTempletMapper;
import com.gsccs.cmcc.wxmp.model.WxTemplet;
import com.gsccs.cmcc.wxmp.model.WxTempletExample;
import com.gsccs.cmcc.wxmp.model.WxTempletExample.Criteria;

/**
 * 微信模板消息
 * @author x.d zhang
 *
 */
@Service
public class WxTempletServiceImpl implements WxTempletService {

	@Autowired
	private WxTempletMapper wxTempletMapper;

	@Override
	public List<WxTemplet> find(WxTemplet param, String order, int currPage,
			int pageSize, boolean iscache) {
		WxTempletExample example = new WxTempletExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return wxTempletMapper.selectPageByExample(example);
	}

	@Override
	public int count(WxTemplet param) {
		WxTempletExample example = new WxTempletExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);
		return wxTempletMapper.countByExample(example);
	}

	@Override
	public WxTemplet find(String appid, String shortid) {
		WxTempletExample example = new WxTempletExample();
		Criteria criteria = example.createCriteria();
		criteria.andWxappidEqualTo(appid);
		criteria.andShortidEqualTo(shortid);
		List<WxTemplet> list = wxTempletMapper.selectByExample(example);
		if (null != list){
			return list.get(0);
		}
		return null;
	}

	@Override
	public WxTemplet findById(String id) {
		return wxTempletMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(WxTemplet param) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long add(WxTemplet param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void del(String id) {
		// TODO Auto-generated method stub

	}

	/**
	 * 处理查询条件
	 * 
	 * @param param
	 * @param criteria
	 */
	public void proSearchParam(WxTemplet param, WxTempletExample.Criteria criteria) {
		if (param != null) {
			if (param.getAppid() != null) {
				criteria.andWxappidEqualTo(param.getAppid());
			}
		}
	}

}
