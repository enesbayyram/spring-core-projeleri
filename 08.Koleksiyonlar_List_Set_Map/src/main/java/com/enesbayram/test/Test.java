package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = applicationContext.getBean("student",Student.class);
		
		System.out.println(student.getStudentList());
		System.out.println("*********************************");
		
		System.out.println(student.getStudentSet());
		System.out.println("*********************************");
		
		System.out.println(student.getStudentMap());
		
		applicationContext.close();
	}
}
