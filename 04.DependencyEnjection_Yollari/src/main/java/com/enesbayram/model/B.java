package com.enesbayram.model;

public class B {

	private A aNesnesi;
	
	public B(A a) {
		this.aNesnesi=a;
		System.out.println("B sınıfının yapıcı metot'u çalıştı.");
	}
	
	public void yaz()
	{
		aNesnesi.yaz();
	}
}
