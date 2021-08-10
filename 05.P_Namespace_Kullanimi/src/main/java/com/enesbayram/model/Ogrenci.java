package com.enesbayram.model;

public class Ogrenci {

	private int no;
	
	private String ad;
	
	private String soyad;
	
	private Okul okul;
	
	public Ogrenci() {

	}

	public Ogrenci(int no, String ad, String soyad) {
		this.no = no;
		this.ad = ad;
		this.soyad = soyad;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}

	@Override
	public String toString() {
		return "Ogrenci [no=" + no + ", ad=" + ad + ", soyad=" + soyad + ", okul=" + okul + "]";
	}
}
