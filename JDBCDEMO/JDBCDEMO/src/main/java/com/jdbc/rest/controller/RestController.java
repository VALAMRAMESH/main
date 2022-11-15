package com.jdbc.rest.controller;

import java.util.List;

import com.jdbc.pojo.Product;
import com.jdbc.rest.exception.JdbcException;
import com.jdbc.rest.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sushant.temkar Rest APIs
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	ProductService ps;

	@RequestMapping("/getDetails")
	public List<Product> hi() throws JdbcException {
		List<Product> pp = ps.getAllProduct();
		return pp;
	}
}
