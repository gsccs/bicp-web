package com.gsccs.cmcc.merchant.dao;

import com.gsccs.cmcc.info.model.PropvalT;
import com.gsccs.cmcc.info.model.PropvalTExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PropvalTMapper {

	int countByExample(PropvalTExample example);

	int deleteByExample(PropvalTExample example);

	int deleteByPrimaryKey(String id);

	int insert(PropvalT record);

	List<PropvalT> selectByExample(PropvalTExample example);

	List<PropvalT> selectCorpProductProps(@Param("productid") String productid,
			@Param("corpid") String corpid);

	List<PropvalT> selectCorpProps(@Param("corpid") String corpid);

	List<PropvalT> selectPageByExample(PropvalTExample example);

	PropvalT selectByPrimaryKey(String id);

	int updateByExample(@Param("record") PropvalT record,
			@Param("example") PropvalTExample example);

	int updateByPrimaryKey(PropvalT record);
}