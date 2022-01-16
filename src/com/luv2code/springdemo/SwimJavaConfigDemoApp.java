package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeSportConfig.class);
		
		//get the bean from spring container
		HandballCoach theCoach = context.getBean("handballCoach", HandballCoach.class);
		 	
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		/*
		//call our new swim coach methods
		System.out.println("email: " + theCoach.getEmail());
		
		System.out.println("team: " + theCoach.getTeam());
*/
		// close the context
		context.close();
	}

}
