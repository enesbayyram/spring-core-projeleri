package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Ogrenci;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Ogrenci ogrenci = applicationContext.getBean("ogrenci",Ogrenci.class);
		
		System.out.println("İsim : "+ogrenci.getIsim());
		System.out.println("Soyisim : " + ogrenci.getSoyisim());
		System.out.println("Yaş : " + ogrenci.getYas());

		System.out.println("Ders : " + ogrenci.getDers().getDers());
		System.out.println("Not : " +ogrenci.getDers().getNot());
		applicationContext.close();
	}
}
