package com.enesbayram.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enesbayram.model.Operator;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Operator operator = applicationContext.getBean("operatorBean",Operator.class);
		System.out.println("Equals : " + operator.isEquals());
		System.out.println("Not Equals : " + operator.isNotEquals());
		System.out.println("Less Than : " +operator.isLessThan());
		System.out.println("Greater Than : " + operator.isGreaterThan());
		System.out.println("Less Than or Equals : " +operator.isLessOrEquals());
		System.out.println("Greater Than or Equals  " + operator.isGreaterOrEquals());
		
		System.out.println("And : " + operator.isAnd());
		System.out.println("Or : " + operator.isOr());
		System.out.println("Not : " + operator.isNot());
		
		System.out.println("Plus : " +operator.getPlus());
		System.out.println("Minus : " +operator.getMinus());
		System.out.println("Multiple : " + operator.getMultiple());
		System.out.println("Divided By : " + operator.getDividedBy());
		
		applicationContext.close();
	}
}
