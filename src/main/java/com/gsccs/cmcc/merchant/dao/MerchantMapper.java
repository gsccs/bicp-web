package com.gsccs.cmcc.merchant.dao;

import com.gsccs.cmcc.info.model.Merchant;
import com.gsccs.cmcc.info.model.MerchantExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MerchantMapper {

	int countByExample(MerchantExample example);
	
	int countByRoleExample(MerchantExample example);

	int deleteByExample(MerchantExample example);

	int deleteByPrimaryKey(String id);

	int insert(Merchant record);

	List<Merchant> selectPageByExample(MerchantExample example);
	
	List<Merchant> selectPageByRoleExample(@Param("userids")String userids,   @Param("example")MerchantExample example);
	
	List<Merchant> selectByExample(MerchantExample example);

	Merchant selectByPrimaryKey(String id);

	int updateByExample(@Param("record") Merchant record,
			@Param("example") MerchantExample example);

	int updateByPrimaryKey(Merchant record);
}