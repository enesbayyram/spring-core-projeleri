package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yazar")
public class Yazar {

	@Value("65")
	private Integer yazarId;
	
	@Value("Mümin Sekman")
	private String yazarAd;
	
	@Value("#{kitap}")
	private Kitap kitap;
	
	public Yazar() {

	}

	public Yazar(Integer yazarId, String yazarAd, Kitap kitap) {
		this.yazarId = yazarId;
		this.yazarAd = yazarAd;
		this.kitap = kitap;
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
