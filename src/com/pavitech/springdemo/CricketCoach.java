package com.pavitech.springdemo;

import com.pavitech.springdemo.inter.FortuneService;

public class CricketCoach implements Coach{
	
	//add new fields here
	private String email;
	private String team;
	
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("cricket coach no args constructor");
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("cricket inside setter email");
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("cricket inside set team");
		this.team = team;
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "cricket coach: get daily workout";
	}

	@Override
	public String getDailyFortune() {
		
		return "cricket coach:" + fortuneService.getFortune()  ;
	}

}
