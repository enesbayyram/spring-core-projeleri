package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.RegexController;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			RegexController regexController= applicationContext.getBean("regexControllerBean",RegexController.class);
			System.out.println(regexController.getResult());
		applicationContext.close();
		
	}
}
