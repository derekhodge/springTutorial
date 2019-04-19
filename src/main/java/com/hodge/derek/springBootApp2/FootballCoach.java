package com.hodge.derek.springBootApp2;

public class FootballCoach implements Coach{
	
	
	private FortuneService fs;
	
	public FootballCoach() {
		System.out.println("Called FortuneCoach's null constructor");
	}
	
	public FootballCoach(FortuneService theFS) {
		this.fs = theFS;
	}
	
	public String getDailyWorkout(){
		return "throw footballs until you die a natural death.";
	}

	public String getNewFortune() {
		return fs.getFortune();
	}
}
