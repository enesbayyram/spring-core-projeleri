package com.enesbayram.model;

public class Selam {

	private String mesaj;
	
	public void mesajYaz()
	{
		System.out.println(getMesaj());
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	
}
