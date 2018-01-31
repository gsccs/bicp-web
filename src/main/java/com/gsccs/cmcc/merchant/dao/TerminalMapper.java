package com.gsccs.cmcc.merchant.dao;

import com.gsccs.cmcc.info.model.Terminal;
import com.gsccs.cmcc.info.model.TerminalExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TerminalMapper {
	
    int countByExample(TerminalExample example);

    int deleteByExample(TerminalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Terminal record);

    int insertSelective(Terminal record);
    List<Terminal> selectPageByExample(TerminalExample example);
    
    List<Terminal> selectByExample(TerminalExample example);
    Terminal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByExample(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByPrimaryKeySelective(Terminal record);

    int updateByPrimaryKey(Terminal record);
}