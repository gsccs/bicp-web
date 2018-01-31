package com.gsccs.cmcc.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.cmcc.product.model.Product;
import com.gsccs.cmcc.product.model.ProductExample;

public interface ProductMapper {

	int countByExample(ProductExample example);

	int deleteByExample(ProductExample example);

	int deleteByPrimaryKey(String id);

	int insert(Product record);

	List<Product> selectPageByExample(ProductExample example);

	List<Product> selectByExample(ProductExample example);

	
	Product selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Product record,
			@Param("example") ProductExample example);

	int updateByExample(@Param("record") Product record,
			@Param("example") ProductExample example);

	int updateByPrimaryKeySelective(Product record);
	int updateByPrimaryKey(Product record);
}