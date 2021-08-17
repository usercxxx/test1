package com.text8_5.util;

public class User {
	private int customerId;
	private String customerNo;
	private float balance;
	private  String customerPwd;
	private  String score;
	private  String customerName;
	private  String email;
	private  String phone;
	private  String address;

	public User(String customerNo, String customerPwd, String customerName) {
		this.customerNo = customerNo;
		this.customerPwd = customerPwd;
		this.customerName = customerName;
	}

	public User(String customerName, String customerPwd) {
		this.customerName = customerName;
		this.customerPwd = customerPwd;
	}

	private  String remark;

	public User() {
	}

	public User(int customerId, String customerNo, float balance, String customerPwd, String score, String customerName, String email, String phone, String address, String remark) {
		this.customerId = customerId;
		this.customerNo = customerNo;
		this.balance = balance;
		this.customerPwd = customerPwd;
		this.score = score;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.remark = remark;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getCustomerPwd() {
		return customerPwd;
	}

	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}


