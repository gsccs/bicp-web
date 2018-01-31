package com.gsccs.cmcc.bill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.bill.model.BillItem;
import com.gsccs.cmcc.bill.model.BillItemExample;

public interface BillItemMapper {

	int countByExample(BillItemExample example);

	int deleteByExample(BillItemExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(BillItem record);

	List<BillItem> selectByExample(BillItemExample example);
	
	List<BillItem> selectPageByExample(BillItemExample example);

	BillItem selectByPrimaryKey(Integer id);

	int updateByExample(@Param("record") BillItem record,
			@Param("example") BillItemExample example);

	int updateByPrimaryKey(BillItem record);
}