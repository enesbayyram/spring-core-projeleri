package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Koleksiyon;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Koleksiyon koleksiyon= applicationContext.getBean("koleksiyonBean",Koleksiyon.class);
		
		System.out.println("Secilen list elemanı : " + koleksiyon.getSecilenList());
		System.out.println("Secilen map elemanı : " + koleksiyon.getSecilenMap());
		
		applicationContext.close();
		
	}
}
