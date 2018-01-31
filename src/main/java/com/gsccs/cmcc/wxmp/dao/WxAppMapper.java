package com.gsccs.cmcc.wxmp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.wxmp.model.WxApp;
import com.gsccs.cmcc.wxmp.model.WxAppExample;

public interface WxAppMapper {

	int countByExample(WxAppExample example);

	int deleteByExample(WxAppExample example);

	int deleteByPrimaryKey(String appId);

	int insert(WxApp record);

	int insertSelective(WxApp record);

	List<WxApp> selectByExample(WxAppExample example);

	List<WxApp> selectPageByExample(WxAppExample example);

	WxApp selectByPrimaryKey(String appId);

	int updateByExampleSelective(@Param("record") WxApp record,
			@Param("example") WxAppExample example);

	int updateByExample(@Param("record") WxApp record,
			@Param("example") WxAppExample example);

	int updateByPrimaryKeySelective(WxApp record);

	int updateByPrimaryKey(WxApp record);
}