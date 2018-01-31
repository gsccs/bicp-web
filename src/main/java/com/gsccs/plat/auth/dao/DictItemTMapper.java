package com.gsccs.plat.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.plat.auth.model.DictItemT;
import com.gsccs.plat.auth.model.DictItemTExample;

public interface DictItemTMapper {
	
	int countByExample(DictItemTExample example);

	int deleteByExample(DictItemTExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(DictItemT record);

	List<DictItemT> selectByExample(DictItemTExample example);

	DictItemT selectByPrimaryKey(Integer id);

	int updateByExample(@Param("record") DictItemT record,
			@Param("example") DictItemTExample example);

	int updateByPrimaryKey(DictItemT record);

	List<DictItemT> selectGroupAndItemList(DictItemTExample example);
}