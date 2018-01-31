package com.gsccs.cmcc.wxmp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.wxmp.model.WxMenu;
import com.gsccs.cmcc.wxmp.model.WxMenuExample;

public interface WxMenuMapper {
    int countByExample(WxMenuExample example);

    int deleteByExample(WxMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(WxMenu record);

    int insertSelective(WxMenu record);

    List<WxMenu> selectByExample(WxMenuExample example);

    WxMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WxMenu record, @Param("example") WxMenuExample example);

    int updateByExample(@Param("record") WxMenu record, @Param("example") WxMenuExample example);

    int updateByPrimaryKeySelective(WxMenu record);

    int updateByPrimaryKey(WxMenu record);
}