package com.gsccs.cmcc.bill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.bill.model.SemreportT;
import com.gsccs.cmcc.bill.model.BillSumExample;

public interface BillSumMapper {

	int countByExample(BillSumExample example);

	int deleteByExample(BillSumExample example);

	int deleteByPrimaryKey(String id);

	int insert(SemreportT record);

	List<SemreportT> selectPageByExample(BillSumExample example);

	SemreportT selectByPrimaryKey(String id);

	int updateByExample(@Param("record") SemreportT record,
			@Param("example") BillSumExample example);

	int updateByPrimaryKey(SemreportT record);
}