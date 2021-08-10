package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Yazar;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Yazar yazar = applicationContext.getBean("yazar",Yazar.class);
		
		System.out.println(yazar.getKitapBilgi());
		
		applicationContext.close();
		
	}
}
