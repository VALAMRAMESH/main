package com.yash.service;

import java.util.List;

import com.yash.model.ProductBean;

public interface ProductService {

	List<ProductBean> ListofProdcut();
	
	public ProductBean GetProductById(int productid);
	
	public void delete(int productid);
	
}
