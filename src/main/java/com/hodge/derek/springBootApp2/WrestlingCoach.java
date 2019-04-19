package com.hodge.derek.springBootApp2;

public class WrestlingCoach implements Coach{
	
	FortuneService fs;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getDailyWorkout() {
		return "Full tilt. 10 minutes. Go!";
	}

	public String getNewFortune() {
		return fs.getFortune();
	}

	public void setFortuneService(FortuneService fs) {
		this.fs = fs;
	}

}
