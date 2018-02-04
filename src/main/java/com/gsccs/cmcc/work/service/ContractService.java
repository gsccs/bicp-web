package com.gsccs.cmcc.work.service;

import java.util.List;

import com.gsccs.cmcc.work.model.Contract;

public interface ContractService {

	public void add(Contract param);

	public void update(Contract param);

	public Contract get(String id);

	public void del(String id);

	public List<Contract> find(Contract param, String order, int currPage,
			int pageSize);
	
	public int count(Contract param);

}
