package com.enesbayram.model;

public class Selam {

	private String mesaj;
	
	public void init()
	{
		System.out.println("Bean başlıyor");
	}
	
	public void destroy()
	{
		System.out.println("Bean bitiyor.");
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
}
