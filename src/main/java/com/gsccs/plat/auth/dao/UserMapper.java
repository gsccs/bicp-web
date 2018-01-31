package com.gsccs.plat.auth.dao;

import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.model.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);
	List<User> selectPageByExample(UserExample example);
	List<User> selectByRoleCode(String code);
	
	User selectByPrimaryKey(Long id);

	
	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserExample example);

	int updateByExample(@Param("record") User record,
			@Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);
	int updateByPrimaryKey(User record);
}