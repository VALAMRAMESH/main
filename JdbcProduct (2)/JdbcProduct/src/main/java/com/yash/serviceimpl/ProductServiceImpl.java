package com.yash.serviceimpl;

import java.util.List;

import com.yash.model.ProductBean;
import com.yash.service.ProductService;

public class ProductServiceImpl implements ProductService{

	    private ProductService productService;
	
	public List<ProductBean> ListofProdcut() {
		   List<ProductBean> list = productService.ListofProdcut();
		   return list;
				   
	}

	public ProductBean GetProductById(int productid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int productid) {
		// TODO Auto-generated method stub
		
	}
	

	

}
