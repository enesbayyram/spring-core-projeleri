package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Customer;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			Customer customer = applicationContext.getBean("customer",Customer.class);
			
			System.out.println("customer id : " + customer.getCustomerId());
			System.out.println("firstname : " + customer.getFirstName());
			System.out.println("lastname : " + customer.getLastName());
			
			System.out.println("siparis id : " + customer.getOrder().getOrderId());
			System.out.println("siparis ismi : " + customer.getOrder().getOrderName());
			System.out.println("siparis fiyati : " + customer.getOrder().getPrice()+" TL");
		
		applicationContext.close();
	}
}
