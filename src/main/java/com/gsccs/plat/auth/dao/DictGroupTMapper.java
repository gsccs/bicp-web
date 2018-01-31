package com.gsccs.plat.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.plat.auth.model.DictGroupT;
import com.gsccs.plat.auth.model.DictGroupTExample;

public interface DictGroupTMapper {
	
	int countByExample(DictGroupTExample example);

	int deleteByExample(DictGroupTExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(DictGroupT record);
	
	List<DictGroupT> selectByExample(DictGroupTExample example);
	List<DictGroupT> selectPageByExample(DictGroupTExample example);

	DictGroupT selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") DictGroupT record,
			@Param("example") DictGroupTExample example);

	int updateByExample(@Param("record") DictGroupT record,
			@Param("example") DictGroupTExample example);

	int updateByPrimaryKeySelective(DictGroupT record);

	int updateByPrimaryKey(DictGroupT record);

	DictGroupT selectByCode(String code);
}