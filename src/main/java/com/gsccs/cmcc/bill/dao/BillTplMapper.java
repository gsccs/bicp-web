package com.gsccs.cmcc.bill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.bill.model.BillSumExample;
import com.gsccs.cmcc.bill.model.BillTpl;
import com.gsccs.cmcc.bill.model.BillTplExample;

public interface BillTplMapper {

	int countByExample(BillTplExample example);

	int deleteByExample(BillTplExample example);

	int deleteByPrimaryKey(String id);

	int insert(BillTpl record);

	List<BillTpl> selectPageByExample(BillTplExample example);

	BillTpl selectByPrimaryKey(String id);

	int updateByExample(@Param("record") BillTpl record,
			@Param("example") BillSumExample example);

	int updateByPrimaryKey(BillTpl record);
}