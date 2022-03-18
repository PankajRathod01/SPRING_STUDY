package com.pavitech.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring container file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("BeanLifeCycel-ApplicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		//close the context
		context.close();
		
	}

}
