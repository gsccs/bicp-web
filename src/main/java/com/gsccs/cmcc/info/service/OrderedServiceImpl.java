package com.gsccs.cmcc.info.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.info.model.Ordered;
import com.gsccs.cmcc.info.model.OrderedExample;
import com.gsccs.cmcc.merchant.dao.MerchantMapper;
import com.gsccs.cmcc.merchant.dao.OrderedMapper;

@Service
public class OrderedServiceImpl implements OrderedService {

	@Autowired
	private MerchantMapper merchantMapper;
	@Autowired
	private OrderedMapper orderedMapper;

	@Override
	public void addOrdered(Ordered ucorp) {
		if (null != ucorp) {
			orderedMapper.insert(ucorp);
		}
	}

	@Override
	public List<Ordered> find(Ordered param, String order, int currPage, int pageSize) {
		OrderedExample example = new OrderedExample();
		OrderedExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return orderedMapper.selectPageByExample(example);
	}


	private void proSearchParam(Ordered param, OrderedExample.Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getMctId())) {
				criteria.andIdEqualTo(param.getMctId());
			}
			
			if (StringUtils.isNotEmpty(param.getMctNo())) {
				criteria.andMchNoEqualTo(param.getMctNo());
			}
		}
	}

	@Override
	public int count(Ordered ucorp) {
		OrderedExample example = new OrderedExample();
		OrderedExample.Criteria c = example.createCriteria();
		proSearchParam(ucorp, c);
		return orderedMapper.countByExample(example);
	}

	@Override
	public Ordered getOrdered(String id) {
		return orderedMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateOrdered(Ordered ucorp) {
		if (null != ucorp) {
			orderedMapper.updateByPrimaryKey(ucorp);
		}
	}

	@Override
	public void delOrdered(String id) {
		orderedMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Ordered> find(Ordered param) {
		OrderedExample example = new OrderedExample();
		OrderedExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return orderedMapper.selectByExample(example);
	}

	
}
