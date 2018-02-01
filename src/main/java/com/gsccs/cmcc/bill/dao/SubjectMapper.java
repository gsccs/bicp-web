package com.gsccs.cmcc.bill.dao;

import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.model.SubjectExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    
    int countByExample(SubjectExample example);
    int deleteByExample(SubjectExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(Subject record);
    List<Subject> selectPageByExample(SubjectExample example);
    Subject selectByPrimaryKey(Integer id);
    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);
    int updateByPrimaryKeySelective(Subject record);
    int updateByPrimaryKey(Subject record);
}