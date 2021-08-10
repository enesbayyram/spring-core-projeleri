package com.enesbayram.model;

public class C {

	public C() {
	System.out.println("C sınıfının boş yapıcı metot'u çalıştı");
	}
	public C(String mesaj,int sayi)
	{
		System.out.println("C sınıfının String ve İnt veri tipinde parametre alan yapıcı metot'u çalıştı");
		System.out.println("Mesaj : " + mesaj +" "+" Sayi : " +sayi); 
	}
	public C(A a , B b)
	{
		System.out.println("C sınıfının A ve B tipinde parametre alan yapıcı metot'u çalıştı");
		
	}
}
