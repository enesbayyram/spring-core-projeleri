package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.A;
import com.enesbayram.model.B;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A aNesne = applicationContext.getBean("beanA",A.class);
		
		System.out.println(aNesne.getMesaj1()+" " +aNesne.getMesaj2());
		applicationContext.close();
	}
}
