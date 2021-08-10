package com.enesbayram.model;

public class Yazar {

	private Integer yazarId;
	
	private String yazarAd;
	
	private Kitap kitap;
	
	private String kitapBilgi;
	
	public Yazar() {

	}

	public Yazar(Integer yazarId, String yazarAd, Kitap kitap) {
		this.yazarId = yazarId;
		this.yazarAd = yazarAd;
		this.kitap = kitap;
	}
	

	public String getKitapBilgi() {
		return kitapBilgi;
	}

	public void setKitapBilgi(String kitapBilgi) {
		this.kitapBilgi = kitapBilgi;
	}

	public Integer getYazarId() {
		return yazarId;
	}

	public void setYazarId(Integer yazarId) {
		this.yazarId = yazarId;
	}

	public String getYazarAd() {
		return yazarAd;
	}

	public void setYazarAd(String yazarAd) {
		this.yazarAd = yazarAd;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
}
