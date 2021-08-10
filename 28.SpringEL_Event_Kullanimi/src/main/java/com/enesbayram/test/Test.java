package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Soz;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		applicationContext.start();
		System.out.println("----------------------");
		applicationContext.refresh();
		
		Soz soz = applicationContext.getBean("soz",Soz.class);
		System.out.println("----------------------");
			System.out.println(soz.getMesaj());
		System.out.println("----------------------");
		
		applicationContext.stop();
		
		applicationContext.close();
	}
}
