package com.gsccs.cmcc.work.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.work.model.Contract;
import com.gsccs.cmcc.work.model.ContractExample;

public interface ContractMapper {

	int countByExample(ContractExample example);

	int deleteByExample(ContractExample example);

	int deleteByPrimaryKey(String ispcode);

	int insert(Contract record);

	List<Contract> selectPageByExample(ContractExample example);

	List<Contract> selectByExample(ContractExample example);
	
	Contract selectByPrimaryKey(String ispcode);

	int updateByExample(@Param("record") Contract record,
			@Param("example") ContractExample example);

	int updateByPrimaryKey(Contract record);
}