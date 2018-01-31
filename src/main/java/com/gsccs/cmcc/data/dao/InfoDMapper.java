package com.gsccs.cmcc.data.dao;

import com.gsccs.cmcc.data.model.InfoD;
import com.gsccs.cmcc.data.model.InfoDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoDMapper {
    int countByExample(InfoDExample example);

    int deleteByExample(InfoDExample example);

    int insert(InfoD record);

    int insertSelective(InfoD record);

    List<InfoD> selectByExample(InfoDExample example);

    int updateByExampleSelective(@Param("record") InfoD record, @Param("example") InfoDExample example);

    int updateByExample(@Param("record") InfoD record, @Param("example") InfoDExample example);
}