package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = applicationContext.getBean("employee",Employee.class);
		
		System.out.println("İD : " + employee.getEmployeeId());
		System.out.println("Firstname : " + employee.getFirstName());
		System.out.println("Lastname : " + employee.getLastName());

		System.out.println("City : " + employee.getAddress().getCity());
		System.out.println("District : " + employee.getAddress().getDistrict());
		System.out.println("Street :  "+ employee.getAddress().getStreet());
		System.out.println("No : " + employee.getAddress().getNo());
		
		applicationContext.close();
	}
}
