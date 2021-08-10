package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Operator;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Operator operator = applicationContext.getBean("operatorBean",Operator.class);
		System.out.println("Sonuç Boolean: "  +operator.isKontrolBoolean());
		System.out.println("Sonuç String : " + operator.getKontrolString());
		
		applicationContext.close();
	}
}
