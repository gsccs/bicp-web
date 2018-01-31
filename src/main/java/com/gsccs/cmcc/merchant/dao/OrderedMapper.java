package com.gsccs.cmcc.merchant.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.info.model.Ordered;
import com.gsccs.cmcc.info.model.OrderedExample;

public interface OrderedMapper {
	
    int countByExample(OrderedExample example);

    int deleteByExample(OrderedExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ordered record);

    int insertSelective(Ordered record);

    List<Ordered> selectByExample(OrderedExample example);
    
    List<Ordered> selectPageByExample(OrderedExample example);

    Ordered selectByPrimaryKey(String id);


    int updateByExample(@Param("record") Ordered record, @Param("example") OrderedExample example);

    int updateByPrimaryKey(Ordered record);
}