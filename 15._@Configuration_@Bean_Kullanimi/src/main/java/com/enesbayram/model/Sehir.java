package com.enesbayram.model;

public class Sehir {

	private String sehirIsmi;
	 
	private Integer plaka;

	public Sehir(String sehirIsmi, Integer plaka) {
		this.sehirIsmi = sehirIsmi;
		this.plaka = plaka;
	}

	public String getSehirIsmi() {
		return sehirIsmi;
	}

	public void setSehirIsmi(String sehirIsmi) {
		this.sehirIsmi = sehirIsmi;
	}

	public Integer getPlaka() {
		return plaka;
	}

	public void setPlaka(Integer plaka) {
		this.plaka = plaka;
	}
	
	
}
