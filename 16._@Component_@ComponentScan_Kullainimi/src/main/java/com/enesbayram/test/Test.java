package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enesbayram.config.AppConfig;
import com.enesbayram.model.HesapMakinesi;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HesapMakinesi hesapMakinesi = applicationContext.getBean("hesapMakinesi",HesapMakinesi.class);
		hesapMakinesi.sonuclariYazdir(10, 5);
		
		applicationContext.close();
	}
}
