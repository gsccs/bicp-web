package com.gsccs.cmcc.data.dao;

import com.gsccs.cmcc.data.model.ReportD;
import com.gsccs.cmcc.data.model.ReportDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportDMapper {
    int countByExample(ReportDExample example);

    int deleteByExample(ReportDExample example);

    int insert(ReportD record);

    int insertSelective(ReportD record);

    List<ReportD> selectByExample(ReportDExample example);

    int updateByExampleSelective(@Param("record") ReportD record, @Param("example") ReportDExample example);

    int updateByExample(@Param("record") ReportD record, @Param("example") ReportDExample example);
}