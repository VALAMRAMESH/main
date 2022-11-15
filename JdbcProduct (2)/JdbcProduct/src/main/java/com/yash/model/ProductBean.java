package com.yash.model;

public class ProductBean {

	int productid;
	String productname;
	double productprice;
	/**
	 * @return the productid
	 */
	public int getProductid() {
		return productid;
	}
	/**
	 * @param productid the productid to set
	 */
	public void setProductid(int productid) {
		this.productid = productid;
	}
	/**
	 * @return the productname
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * @param productname the productname to set
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * @return the productprice
	 */
	public double getProductprice() {
		return productprice;
	}
	/**
	 * @param productprice the productprice to set
	 */
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	
	public ProductBean(int productid, String productname, double productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
	}
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductBean [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ "]";
	}
	
	
	
	
}
