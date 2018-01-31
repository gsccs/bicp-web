package com.gsccs.cmcc.process.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.process.model.Node;
import com.gsccs.cmcc.process.model.NodeExample;

public interface NodeMapper {

	int countByExample(NodeExample example);

	int deleteByExample(NodeExample example);

	int deleteByPrimaryKey(String id);

	int insert(Node record);

	int insertSelective(Node record);

	List<Node> selectByExample(NodeExample example);
	List<Node> selectPageByExample(NodeExample example);

	Node selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Node record,
			@Param("example") NodeExample example);

	int updateByExample(@Param("record") Node record,
			@Param("example") NodeExample example);

	int updateByPrimaryKeySelective(Node record);
	int updateByPrimaryKey(Node record);
}