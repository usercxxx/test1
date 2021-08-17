package com.text8_5.util;

public class good {
	private int productId;
	private String productName;
	private float price;
	private  int number;
	private  String productDesc;

	public good() {
	}

	public good(int productId, String productName, float price, int number, String productDesc) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.number = number;
		this.productDesc = productDesc;
	}

	public good(int productId, String productName, float price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
}


