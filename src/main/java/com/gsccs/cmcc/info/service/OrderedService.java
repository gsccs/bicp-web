package com.gsccs.cmcc.info.service;

import java.util.List;

import com.gsccs.cmcc.info.model.Ordered;

/**
 * 商户订购关系业务
 * @author x.d zhang
 *
 */
public interface OrderedService {

	public void addOrdered(Ordered param);

	public void updateOrdered(Ordered param);

	public Ordered getOrdered(String id);

	public void delOrdered(String id);

	public List<Ordered> find(Ordered param, String order, int currPage,
			int pageSize);
	
	public List<Ordered> find(Ordered param);

	public int count(Ordered param);
}
