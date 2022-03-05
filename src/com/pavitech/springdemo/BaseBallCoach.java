package com.pavitech.springdemo;

import com.pavitech.springdemo.inter.FortuneService;

public class BaseBallCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	
	public BaseBallCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkOut(){
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a Fortune
		
		return fortuneService.getFortune();
	}
}
