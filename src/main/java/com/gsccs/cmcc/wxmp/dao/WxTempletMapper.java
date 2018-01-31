package com.gsccs.cmcc.wxmp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.wxmp.model.WxTemplet;
import com.gsccs.cmcc.wxmp.model.WxTempletExample;

public interface WxTempletMapper {

	int countByExample(WxTempletExample example);

	int deleteByExample(WxTempletExample example);

	int deleteByPrimaryKey(String id);

	int insert(WxTemplet record);

	List<WxTemplet> selectByExample(WxTempletExample example);

	WxTemplet selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") WxTemplet record,
			@Param("example") WxTempletExample example);

	int updateByExample(@Param("record") WxTemplet record,
			@Param("example") WxTempletExample example);

	int updateByPrimaryKeySelective(WxTemplet record);

	int updateByPrimaryKey(WxTemplet record);

	List<WxTemplet> selectPageByExample(WxTempletExample example);
}