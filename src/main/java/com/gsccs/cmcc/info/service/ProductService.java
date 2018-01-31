package com.gsccs.cmcc.info.service;

import java.util.List;

import com.gsccs.cmcc.product.model.Product;

public interface ProductService {

	public void addProduct(Product product);

	public void updateProduct(Product product);

	public Product getProduct(String id);

	public void delProduct(String id);

	public List<Product> find(Product product, String order, int currPage,
			int pageSize);
	
	public List<Product> find(Product product);

	public int count(Product product);
	
	
	
}
