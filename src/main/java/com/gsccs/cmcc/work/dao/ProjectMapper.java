package com.gsccs.cmcc.work.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.work.model.Project;
import com.gsccs.cmcc.work.model.ProjectExample;

public interface ProjectMapper {

	int countByExample(ProjectExample example);

	int deleteByExample(ProjectExample example);

	int deleteByPrimaryKey(String ispcode);

	int insert(Project record);

	List<Project> selectPageByExample(ProjectExample example);

	List<Project> selectByExample(ProjectExample example);
	
	Project selectByPrimaryKey(String ispcode);

	int updateByExample(@Param("record") Project record,
			@Param("example") ProjectExample example);

	int updateByPrimaryKey(Project record);
}