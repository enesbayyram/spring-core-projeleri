package com.enesbayram.model;

public class A {

	private String mesaj1;
	
	private String mesaj2;
	
	public A() {
		System.out.println("A Sınıfının yapıcı metot'u çalıştı.");
	}
	
	public void yaz()
	{
		System.out.println("A sinifi içindeki yazdirma metot'u çalıştı.");
	}

	public String getMesaj1() {
		return mesaj1;
	}

	public void setMesaj1(String mesaj1) {
		this.mesaj1 = mesaj1;
	}

	public String getMesaj2() {
		return mesaj2;
	}

	public void setMesaj2(String mesaj2) {
		this.mesaj2 = mesaj2;
	}
}
