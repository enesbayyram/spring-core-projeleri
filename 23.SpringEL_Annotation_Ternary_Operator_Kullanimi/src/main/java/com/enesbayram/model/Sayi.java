package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sayiBean")
public class Sayi {

	@Value("12")
	private int sayi1;
	
	@Value("2")
	private int sayi2;
	
	public int getSayi1() {
		return sayi1;
	}
	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}
	public int getSayi2() {
		return sayi2;
	}
	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}
	
	
}
