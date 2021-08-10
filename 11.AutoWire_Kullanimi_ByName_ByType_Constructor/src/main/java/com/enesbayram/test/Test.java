package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Calisan;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			Calisan calisan = applicationContext.getBean("calisan",Calisan.class);
			System.out.println(calisan);
		
		applicationContext.close();
	}
}
