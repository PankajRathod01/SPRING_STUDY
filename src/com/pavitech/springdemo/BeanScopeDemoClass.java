package com.pavitech.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring container file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("BeanScope-ApplicationContext.xml");
		
		//retrieve bean from sping container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("pointing to the same object=" + result);
		
		System.out.println("memory location for theCoach=" + theCoach);
		
		System.out.println("memory location for alphaCoach=" + alphaCoach);
		
		//close the context
		context.close();
		
	}

}
