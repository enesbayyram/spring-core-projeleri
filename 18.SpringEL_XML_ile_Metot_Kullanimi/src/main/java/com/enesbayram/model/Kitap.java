package com.enesbayram.model;

public class Kitap {

	private Integer kitapId;

	private String kitapAd;

	private double kitapFiyat;

	public Kitap() {
	}
	
	public Kitap(Integer kitapId, String kitapAd, double kitapFiyat) {
		this.kitapId = kitapId;
		this.kitapAd = kitapAd;
		this.kitapFiyat = kitapFiyat;
	}
	
	public String kitapBilgisiGetir()
	{
		return "Kitap İD:"+getKitapId()+ " " +"Kitap Ad : " + getKitapAd()+" " +"Kitap Fiyat : " + getKitapFiyat();
	}
	
	public Integer getKitapId() {
		return kitapId;
	}	

	public void setKitapId(Integer kitapId) {
		this.kitapId = kitapId;
	}

	public String getKitapAd() {
		return kitapAd;
	}

	public void setKitapAd(String kitapAd) {
		this.kitapAd = kitapAd;
	}

	public double getKitapFiyat() {
		return kitapFiyat;
	}

	public void setKitapFiyat(double kitapFiyat) {
		this.kitapFiyat = kitapFiyat;
	}
	
}
