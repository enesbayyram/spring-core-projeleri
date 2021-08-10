package com.enesbayram.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Soz {

	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Bean oluşturulmadan önce init metot çalıştı");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean öldü destroy metot çalıştı");
	}
	
}
