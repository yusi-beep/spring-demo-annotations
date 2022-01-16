package com.luv2code.springdemo;

public class HandballCoach implements Coach {

	FortuneService fortuneService;
	
	
	public HandballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Complate 100 diving shots.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
