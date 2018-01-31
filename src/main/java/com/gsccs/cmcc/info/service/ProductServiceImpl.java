package com.gsccs.cmcc.info.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.product.dao.ProductMapper;
import com.gsccs.cmcc.product.model.Product;
import com.gsccs.cmcc.product.model.ProductExample;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public void addProduct(Product product) {
		if (null != product) {
			if (StringUtils.isEmpty(product.getId())){
				product.setId(UUID.randomUUID().toString());
			}
			productMapper.insert(product);
		}
	}

	@Override
	public List<Product> find(Product product, String order, int currPage, int pageSize) {
		ProductExample example = new ProductExample();
		ProductExample.Criteria c = example.createCriteria();
		proSearchParam(product, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return productMapper.selectPageByExample(example);
	}


	private void proSearchParam(Product product, ProductExample.Criteria criteria) {
		if (product != null) {
			if (product.getId() != null) {
				criteria.andIdEqualTo(product.getId());
			}

			if (StringUtils.isNotEmpty(product.getTitle())) {
				criteria.andTitleLike("%" + product.getTitle() + "%");
			}
			
			if(StringUtils.isNotEmpty(product.getIssem())){
				criteria.andIssemEqualTo(product.getIssem());
			}
			
			if(StringUtils.isNotEmpty(product.getStatus())){
				criteria.andStatusEqualTo(product.getStatus());
			}
		}
	}

	@Override
	public int count(Product product) {
		ProductExample example = new ProductExample();
		ProductExample.Criteria c = example.createCriteria();
		proSearchParam(product, c);
		return productMapper.countByExample(example);
	}

	@Override
	public Product getProduct(String id) {
		return productMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateProduct(Product product) {
		if (null != product) {
			productMapper.updateByPrimaryKey(product);
		}
	}

	@Override
	public void delProduct(String id) {
		productMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Product> find(Product product) {
		ProductExample example = new ProductExample();
		ProductExample.Criteria c = example.createCriteria();
		proSearchParam(product, c);
		return productMapper.selectByExample(example);
	}
}
