package com.enesbayram.model;

public class Calisan {

	private String firstName;
	
	private String lastName;
	
	private Adres adres;
	public Calisan() {
	}
	
	public Calisan(Adres adres) {
		this.adres=adres;
	}

	public Calisan(String firstName, String lastName, Adres adres) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.adres = adres;
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

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Calisan [firstName=" + firstName + ", lastName=" + lastName + ", adres=" + adres + "]";
	}
}
