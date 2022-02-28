package com.pavitech.springdemo;

public class BaseBallCoach implements Coach{
	@Override
	public String getDailyWorkOut(){
		return "spend 30 minutes on batting practice";
	}
}
