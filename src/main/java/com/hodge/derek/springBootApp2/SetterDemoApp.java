package com.hodge.derek.springBootApp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		WrestlingCoach theCoach = context.getBean("wrestlingCoach", WrestlingCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getNewFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		context.close();

	}

}
