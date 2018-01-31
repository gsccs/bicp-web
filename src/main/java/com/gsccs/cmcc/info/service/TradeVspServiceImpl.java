package com.gsccs.cmcc.info.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.data.dao.TradeVspMapper;
import com.gsccs.cmcc.data.model.TradeVsp;
import com.gsccs.cmcc.data.model.TradeVspExample;

@Service
public class TradeVspServiceImpl implements TradeVspService {

	@Autowired
	private TradeVspMapper tradeVspMapper;

	@Override
	public void add(TradeVsp param) {
		if (null != param) {
			tradeVspMapper.insert(param);
		}
	}



	@Override
	public List<TradeVsp> find(TradeVsp param, String order, int currPage,
			int pageSize) {
		TradeVspExample example = new TradeVspExample();
		TradeVspExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return tradeVspMapper.selectPageByExample(example);
	}

	private void proSearchParam(TradeVsp param,
			TradeVspExample.Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getMchno())) {
				criteria.andMchNoEqualTo(param.getMchno());
			}
		}
	}

	@Override
	public int count(TradeVsp param) {
		TradeVspExample example = new TradeVspExample();
		TradeVspExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return tradeVspMapper.countByExample(example);
	}

	@Override
	public TradeVsp get(Long id) {
		return tradeVspMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public void update(TradeVsp param) {
		if (null != param) {
			tradeVspMapper.updateByPrimaryKey(param);
		}
	}

	@Override
	public void del(Long id) {
		tradeVspMapper.deleteByPrimaryKey(id);
	}


}
