package com.enesbayram.test;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Collections;
import com.enesbayram.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext  =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collections collections = applicationContext.getBean("collection",Collections.class);
		
		System.out.println("Student LİST");
		for (Student student : collections.getStudentList()) {
			System.out.println(student);
		}
		
		System.out.println("*******************************************");
		
		System.out.println("Student SET LİST");
		for (Student student: collections.getStudentSet()) {
			System.out.println(student);
		}
		System.out.println("*******************************************");
		System.out.println("Student MAP");
		  for (Map.Entry<Integer,Student> entry : collections.getStudentMap().entrySet()) {
		        System.out.println(entry.getKey() + " - " + entry.getValue());
		    }
		
		applicationContext.close();
	}
}
