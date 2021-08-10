package com.enesbayram.model;

public class Musteri {

	private String ad;
	
	private String soyad;
	
	private Adres adres;
	
	public Musteri() {

	}

	public Musteri(String ad, String soyad, Adres adres) {
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Musteri [ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + "]";
	}
	
}
