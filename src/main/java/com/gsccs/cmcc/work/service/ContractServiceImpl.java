package com.gsccs.cmcc.work.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.work.dao.ContractMapper;
import com.gsccs.cmcc.work.model.Contract;
import com.gsccs.cmcc.work.model.ContractExample;
import com.gsccs.cmcc.work.model.TaskExample;
import com.gsccs.plat.auth.service.UserService;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private UserService userService;
	@Autowired
	private ContractMapper contractMapper;

	@Override
	public void add(Contract param) {
		if (null != param) {
			if (StringUtils.isEmpty(param.getId())){
				param.setId(UUID.randomUUID().toString());
			}
			contractMapper.insert(param);
		}
	}

	@Override
	public List<Contract> find(Contract param, String order, int currPage, int pageSize) {
		ContractExample example = new ContractExample();
		ContractExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return contractMapper.selectPageByExample(example);
	}


	private void proSearchParam(Contract param, ContractExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}

			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%" + param.getTitle() + "%");
			}
		}
	}

	@Override
	public int count(Contract contact) {
		ContractExample example = new ContractExample();
		ContractExample.Criteria c = example.createCriteria();
		proSearchParam(contact, c);
		return contractMapper.countByExample(example);
	}

	@Override
	public Contract get(String id) {
		return contractMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(Contract contact) {
		if (null != contact) {
			contractMapper.updateByPrimaryKey(contact);
		}
	}

	@Override
	public void del(String id) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		c.andPidEqualTo(id);
		contractMapper.deleteByPrimaryKey(id);
	}

}
