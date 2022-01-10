package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		 	
		//practice activity- get the bean from spring container
		Coach practiceCoach = context.getBean("volleyballCoach", Coach.class);
		
		System.out.println(practiceCoach.getDailyWorkout());
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
