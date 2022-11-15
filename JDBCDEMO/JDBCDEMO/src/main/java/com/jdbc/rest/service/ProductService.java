package com.jdbc.rest.service;

import java.util.List;

import com.jdbc.pojo.Product;
import com.jdbc.rest.exception.JdbcException;

/**
 * 
 * @author sushant.temkar List of operation for giving service of product
 */

public interface ProductService {

	public String saveProduct(Product p) throws JdbcException;

	public List<Product> getAllProduct() throws JdbcException;

	public int getLatestId() throws JdbcException;

	public String updateProduct(int id, String name, double price) throws JdbcException;

	public String deleteProduct(int id) throws JdbcException;
}
