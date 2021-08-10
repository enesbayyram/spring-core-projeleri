package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Musteri;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("hepsininToplami.xml");
		
		Musteri musteri = applicationContext.getBean("musteri",Musteri.class);
		System.out.println(musteri);
		
		
		applicationContext.close();
	}
}
