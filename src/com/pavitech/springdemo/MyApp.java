package com.pavitech.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Coach theCoach = new BaseBallCoach();
//		
//		System.out.println(theCoach.getDailyWorkOut());
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		//let's call new method's
		
		System.out.println(theCoach.getDailyFortune());
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmail());
		System.out.println(cricketCoach.getTeam());
		//close the context
		context.close();
	}

}
