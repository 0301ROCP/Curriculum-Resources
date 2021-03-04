package com.revature.superheroes;

public class Athlete extends Human{
	
	
	public String talent;
	
	public Athlete() {
		//super();
//		System.out.println("Inside athlete's constructor!");
	}
	
	public Athlete(String name,String talent) {
		this.name = name;
		this.talent = talent;
	}
	
	
	@Override
	public void move() {
		super.move(); //My athelete can also walk quickly!
		System.out.println("I can run quickly!"); //adding functionality 
	}

}
