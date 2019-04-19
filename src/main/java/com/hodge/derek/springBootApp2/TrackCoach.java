package com.hodge.derek.springBootApp2;

public class TrackCoach implements Coach{
	
	private FortuneService fs;
	
	public TrackCoach(FortuneService theFS) {
		this.fs = theFS;
	}
	
	public String getDailyWorkout(){
		return "run until your legs fall off.";
	}

	public String getNewFortune() {
		return fs.getFortune();
	}
}
