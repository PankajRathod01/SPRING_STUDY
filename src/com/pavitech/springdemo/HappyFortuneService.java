package com.pavitech.springdemo;

import com.pavitech.springdemo.inter.FortuneService;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		
		return "today is your lucky day";
	}

}
