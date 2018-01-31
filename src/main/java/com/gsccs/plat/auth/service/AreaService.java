package com.gsccs.plat.auth.service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.gsccs.plat.auth.model.AreaT;

public interface AreaService {

	public void add(AreaT area);

	public void update(AreaT area);

	public AreaT findById(Integer id);

	public List<AreaT> find(AreaT area);
	
	/**
	 * 递归查询子节点
	 * @param area
	 * @return
	 */
	public List<AreaT> findAllSubArea(Integer pid);
	public String findAllSubAreaIds(Integer pid);
	
	public JSONArray findAreaTree();
	public JSONArray findAreaTree(Integer pid);
}
