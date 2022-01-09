package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "100 sets";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
