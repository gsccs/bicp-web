package com.gsccs.cmcc.info.service;

import java.util.List;

import com.gsccs.cmcc.data.model.TradeVsp;

public interface TradeVspService {

	public void add(TradeVsp param);

	public void update(TradeVsp param);

	public TradeVsp get(Long id);

	public void del(Long id);

	public List<TradeVsp> find(TradeVsp param, String order, int currPage,
			int pageSize);

	public int count(TradeVsp specline);

}
