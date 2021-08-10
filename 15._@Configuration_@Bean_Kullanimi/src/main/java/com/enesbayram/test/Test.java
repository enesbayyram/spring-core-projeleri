package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enesbayram.config.AppConfig;
import com.enesbayram.model.Ogrenci;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Ogrenci ogrenci = applicationContext.getBean("ogrenciBean",Ogrenci.class);
		
		System.out.println("İsim : " + ogrenci.getIsim());
		System.out.println("Soyisim : " +ogrenci.getSoyisim());
		System.out.println("Şehir : " + ogrenci.getSehir().getSehirIsmi());
		System.out.println("Plaka : " +ogrenci.getSehir().getPlaka());
		
		applicationContext.close();
		
	}
}
