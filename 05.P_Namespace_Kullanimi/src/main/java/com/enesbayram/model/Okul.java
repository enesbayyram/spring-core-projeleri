package com.enesbayram.model;

public class Okul {

	private int kurumId;
	
	private String kurumAd;
	
	
	public Okul() {
	}

	public Okul(int kurumId, String kurumAd) {
		this.kurumId = kurumId;
		this.kurumAd = kurumAd;
	}


	public int getKurumId() {
		return kurumId;
	}

	public void setKurumId(int kurumId) {
		this.kurumId = kurumId;
	}


	public String getKurumAd() {
		return kurumAd;
	}


	public void setKurumAd(String kurumAd) {
		this.kurumAd = kurumAd;
	}

	@Override
	public String toString() {
		return "Okul [kurumId=" + kurumId + ", kurumAd=" + kurumAd + "]";
	}
}
