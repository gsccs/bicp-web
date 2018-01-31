package com.gsccs.cmcc.merchant.dao;

import com.gsccs.cmcc.info.model.TerminalHis;
import com.gsccs.cmcc.info.model.TerminalHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalHisMapper {
	
    int countByExample(TerminalHisExample example);

    int deleteByExample(TerminalHisExample example);

    int deleteByPrimaryKey(String id);

    int insert(TerminalHis record);

    int insertSelective(TerminalHis record);

    List<TerminalHis> selectByExample(TerminalHisExample example);

    List<TerminalHis> selectPageByExample(TerminalHisExample example);
    
    TerminalHis selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TerminalHis record, @Param("example") TerminalHisExample example);

    int updateByExample(@Param("record") TerminalHis record, @Param("example") TerminalHisExample example);

    int updateByPrimaryKeySelective(TerminalHis record);

    int updateByPrimaryKey(TerminalHis record);
}