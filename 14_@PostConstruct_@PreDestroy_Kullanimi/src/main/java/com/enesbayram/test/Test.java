package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Soz;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			Soz soz = applicationContext.getBean("soz",Soz.class);
			System.out.println(soz.getMesaj());
		
		applicationContext.close();
	}
}
