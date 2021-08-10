package com.enesbayram.model;

public class Address {

	private Integer addressId;
	
	private String city;
	
	private String district;
	
	private String street;
	
	private String no;
	
	public Address() {

	}

	public Address(Integer addressId, String city, String district, String street, String no) {
		this.addressId = addressId;
		this.city = city;
		this.district = district;
		this.street = street;
		this.no = no;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", district=" + district + ", street=" + street
				+ ", no=" + no + "]";
	}
	
	
}
