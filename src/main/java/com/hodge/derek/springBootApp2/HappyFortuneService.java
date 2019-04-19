package com.hodge.derek.springBootApp2;

public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		
	}
	
	public HappyFortuneService(String s) {
		System.out.println("Constructor Arg: " + s);
	}
	
	@Override
	public String getFortune() {
		return "thou shalt find a great fortune on the road and be hit by a bus when you stop to pick it up";
	}
	
	public void setFortune(String s) {
		System.out.println(s);
	}
}
