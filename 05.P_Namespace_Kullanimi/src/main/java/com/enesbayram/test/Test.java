package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Ogrenci;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Ogrenci ogrenci = applicationContext.getBean("ogrenci",Ogrenci.class);
		
		System.out.println(ogrenci);
		
		applicationContext.close();
	}
}
