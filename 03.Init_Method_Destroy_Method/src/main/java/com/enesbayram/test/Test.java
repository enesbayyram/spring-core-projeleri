package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Selam;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Selam selam = applicationContext.getBean("selam",Selam.class);
		System.out.println(selam.getMesaj());
		
		applicationContext.close();
	}
}
