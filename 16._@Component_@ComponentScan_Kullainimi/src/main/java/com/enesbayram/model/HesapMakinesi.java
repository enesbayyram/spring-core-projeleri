package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hesapMakinesi")
public class HesapMakinesi {

	@Autowired
	private Islem islem;

	public void sonuclariYazdir(int sayi1, int sayi2) {
		System.out.println("Toplama : " + islem.topla(sayi1, sayi2));
		System.out.println("Çıkarma : " + islem.cikar(sayi1, sayi2));
		System.out.println("Çarpma : " + islem.carp(sayi1, sayi2));
		System.out.println("Bölme : " + islem.bol(sayi1, sayi2));
	}

}
