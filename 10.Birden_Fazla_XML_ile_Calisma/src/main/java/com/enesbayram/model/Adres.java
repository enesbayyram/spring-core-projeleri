package com.enesbayram.model;

public class Adres {

	private String sehir;
	
	private String ilce;
	
	private String sokak;
	
	private String no;
	
	public Adres() {

	}

	public Adres(String sehir, String ilce, String sokak, String no) {
		this.sehir = sehir;
		this.ilce = ilce;
		this.sokak = sokak;
		this.no = no;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Adres [sehir=" + sehir + ", ilce=" + ilce + ", sokak=" + sokak + ", no=" + no + "]";
	}
	
	
}
