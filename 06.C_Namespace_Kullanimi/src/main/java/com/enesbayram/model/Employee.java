package com.enesbayram.model;

public class Employee {
	
	private Integer employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private Address address;
	
	public Employee() {
	}
	

	public Employee(Integer employeeId, String firstName, String lastName, Address address) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
//				+ ", address=" + address + "]";
//	}
	
}
