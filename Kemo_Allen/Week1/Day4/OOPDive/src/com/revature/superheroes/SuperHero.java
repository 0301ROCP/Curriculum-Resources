package com.revature.superheroes;

public class SuperHero extends Athlete{
	
	public String power;
	
	public SuperHero() { //no-args 
//		super();
//		System.out.println("Inside Superhero constructor");
	}
	
	
	public SuperHero(String name, String talent, String power) { //parameterized - (all-args)
//		this.name = name;
//		this.power = power;
//		this.talent = "blank";
		
		super(name,talent);
		this.power = power;
	}
	
	@Override
	public void move() {
		super.move();
		System.out.println("I can fly!");
	}
	
	public void fly() {
		System.out.println("Look at me flying!");
	}

}
