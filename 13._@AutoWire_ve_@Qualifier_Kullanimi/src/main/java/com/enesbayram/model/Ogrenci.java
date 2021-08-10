package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ogrenci {

	private String isim;
	
	private String soyisim;
	
	private Integer yas;
	
	@Autowired
	@Qualifier(value = "ders4")
	private Ders ders;
	
	public Ogrenci() {

	}

	public Ogrenci(String isim, String soyisim, Integer yas) {
		this.isim = isim;
		this.soyisim = soyisim;
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

	public Integer getYas() {
		return yas;
	}

	public void setYas(Integer yas) {
		this.yas = yas;
	}

	public Ders getDers() {
		return ders;
	}

	public void setDers(Ders ders) {
		this.ders = ders;
	}
	
}
