package com.enesbayram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enesbayram.model.Ogrenci;
import com.enesbayram.model.Sehir;

@Configuration
public class AppConfig {

	public Sehir sehir()
	{
		return new Sehir("Samsun", 55);
	}
	
	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenci()
	{
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Enes");
		ogrenci.setSoyisim("Bayram");
		ogrenci.setSehir(sehir());
		return ogrenci;
	}
}
