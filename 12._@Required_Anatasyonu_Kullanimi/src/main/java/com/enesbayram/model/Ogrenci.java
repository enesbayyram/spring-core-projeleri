package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {

	
	private String isim;
	
	private String soyisim;
	
	private Integer yas;
	
	public Ogrenci() {

	}

	public Ogrenci(String isim, String soyisim, Integer yas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}

	public Integer getYas() {
		return yas;
	}

	@Required
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	
	
	
}
