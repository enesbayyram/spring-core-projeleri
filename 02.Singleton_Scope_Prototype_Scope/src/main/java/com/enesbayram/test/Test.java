package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Selam;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Selam nesne1 = applicationContext.getBean("selam",Selam.class);
		nesne1.setMesaj("Enes Bayram");
		nesne1.mesajYaz();
		
		Selam nesne2 = applicationContext.getBean("selam",Selam.class);
		nesne2.mesajYaz();
		
		System.out.println("nesne1 : " + nesne1);
		System.out.println("nesne2 : " + nesne2);
		
		applicationContext.close();
	}
}
