package com.gsccs.cmcc.bill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.bill.model.BillSum;
import com.gsccs.cmcc.bill.model.BillSumExample;
import com.gsccs.cmcc.bill.model.BillTpl;

public interface BillSumMapper {

	int countByExample(BillSumExample example);

	int deleteByExample(BillSumExample example);

	int deleteByPrimaryKey(String id);

	int insert(BillSum record);

	List<BillSum> selectPageByExample(BillSumExample example);

	BillSum selectByPrimaryKey(String id);

	int updateByExample(@Param("record") BillTpl record,
			@Param("example") BillSumExample example);

	int updateByPrimaryKey(BillTpl record);
}