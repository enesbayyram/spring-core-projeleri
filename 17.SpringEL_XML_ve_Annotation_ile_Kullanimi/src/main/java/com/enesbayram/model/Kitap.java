package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitap")
public class Kitap {

	@Value("1")
	private Integer kitapId;

	@Value("Her şey Seninle Başlar")
	private String kitapAd;

	@Value("12.6")
	private double kitapFiyat;

	public Kitap() {

	}

	public Kitap(Integer kitapId, String kitapAd, double kitapFiyat) {
		this.kitapId = kitapId;
		this.kitapAd = kitapAd;
		this.kitapFiyat = kitapFiyat;
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
