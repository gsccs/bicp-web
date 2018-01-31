package com.gsccs.cmcc.process.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.process.model.Define;
import com.gsccs.cmcc.process.model.DefineExample;

public interface DefineMapper {

	int countByExample(DefineExample example);

	int deleteByExample(DefineExample example);

	int deleteByPrimaryKey(String id);

	int insert(Define record);

	int insertSelective(Define record);

	List<Define> selectByExample(DefineExample example);
	List<Define> selectPageByExample(DefineExample example);

	Define selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Define record,
			@Param("example") DefineExample example);
	int updateByExample(@Param("record") Define record,
			@Param("example") DefineExample example);

	int updateByPrimaryKeySelective(Define record);

	int updateByPrimaryKey(Define record);
}