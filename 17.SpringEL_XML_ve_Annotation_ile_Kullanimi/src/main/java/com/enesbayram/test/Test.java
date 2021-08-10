package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Yazar;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Yazar yazar = applicationContext.getBean("yazar",Yazar.class);
		
		System.out.println("Yazar id : " + yazar.getYazarId());
		System.out.println("Yazar İsmi : " +yazar.getYazarAd());
		System.out.println("***********************************");
		System.out.println("Kitap id : " + yazar.getKitap().getKitapId());
		System.out.println("Kitap Ad : " + yazar.getKitap().getKitapAd());
		System.out.println("Kitap Fiyat : " +yazar.getKitap().getKitapFiyat());
		
		applicationContext.close();
		
	}
}
