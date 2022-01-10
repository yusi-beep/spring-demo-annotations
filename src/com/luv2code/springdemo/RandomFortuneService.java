package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create array of string 
	String[] data;
	
	Random random = new Random();
	
	@Override
	public String getFortune() {
		
		//random fortune 
		int index = random.nextInt(data.length);
		
		String myFortune = data[index];
		
		return myFortune;
	}

}
