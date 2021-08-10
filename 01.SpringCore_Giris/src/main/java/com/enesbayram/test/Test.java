package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enesbayram.config.AppConfig;
import com.enesbayram.interf.ISelam;
import com.enesbayram.interf.impl.SelamImpl;
import com.enesbayram.model.A;
import com.enesbayram.model.B;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		ISelam selam = applicationContext.getBean("selam",SelamImpl.class);
//		selam.mesajYaz("Enes Bayram Spring core öğreniyor...");
		
		A aNesnesi = applicationContext.getBean("abean",A.class);
		B bNesnesi = applicationContext.getBean("bbean",B.class);
		
		aNesnesi.yazdir("Enes Bayram");
		bNesnesi.yazdir("Aynur Bayram");
		
		applicationContext.close();
	}
}
