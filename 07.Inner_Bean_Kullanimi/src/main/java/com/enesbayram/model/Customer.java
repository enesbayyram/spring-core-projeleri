package com.enesbayram.model;

public class Customer {

	private int customerId;
	
	private String firstName;
	
	private String lastName;
	
	private Order order;
	
	public Customer() {

	}

	public Customer(int customerId, String firstName, String lastName,Order order) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.order=order;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
