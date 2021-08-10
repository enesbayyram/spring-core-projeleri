package com.enesbayram.model;

public class Order {
	
	private int orderId;
	
	private String orderName;
	
	private double price;
	
	public Order() {

	}

	public Order(int orderId, String orderName, double price) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
