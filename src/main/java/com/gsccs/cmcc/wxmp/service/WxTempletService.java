package com.gsccs.cmcc.wxmp.service;

import java.util.List;

import com.gsccs.cmcc.wxmp.model.WxTemplet;

public interface WxTempletService {

	/**
	 * 分页查询
	 */
	public List<WxTemplet> find(WxTemplet param, String order, int currPage,
			int pageSize, boolean iscache);

	public int count(WxTemplet param);

	/**
	 * 根据应用ID及编码查询模板
	 * @param appid
	 * @param code
	 * @return
	 */
	public WxTemplet find(String appid,String code);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @param cache
	 * @return
	 */
	public WxTemplet findById(String id);

	/**
	 * 更新
	 * 
	 * @param param
	 */
	public void update(WxTemplet param);

	/**
	 * 添加
	 * 
	 * @param param
	 * @return
	 */
	public Long add(WxTemplet param);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void del(String id);

}
