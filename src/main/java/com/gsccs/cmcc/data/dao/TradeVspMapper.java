package com.gsccs.cmcc.data.dao;

import java.util.List;

import com.gsccs.cmcc.data.model.TradeVsp;
import com.gsccs.cmcc.data.model.TradeVspExample;

public interface TradeVspMapper {

	List<TradeVsp> selectPageByExample(TradeVspExample example);

	int countByExample(TradeVspExample example);

	int deleteByExample(TradeVspExample example);

	int insert(TradeVsp record);

	TradeVsp selectByPrimaryKey(Long id);

	int deleteByPrimaryKey(Long id);

	int updateByPrimaryKey(TradeVsp record);

	void callUpdateSpecline();
}