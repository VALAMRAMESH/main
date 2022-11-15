package io.javabrains.utils;

public class Item {
	
	private String itemname;
	private int price;
	private int discountasfileds;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountasfileds() {
		return discountasfileds;
	}
	public void setDiscountasfileds(int discountasfileds) {
		this.discountasfileds = discountasfileds;
	}
	@Override
	public String toString() {
		return "Item [itemname=" + itemname + ", price=" + price + ", discountasfileds=" + discountasfileds + "]";
	}
	
	

}
