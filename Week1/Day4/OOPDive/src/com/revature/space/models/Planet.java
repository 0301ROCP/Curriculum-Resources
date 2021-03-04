package com.revature.space.models;

public class Planet {
	
	public String name;
	public double mass;
	
	public Planet() {
		System.out.println("Inside no args!");
	}
	
	public Planet(String name) {
		
	}
	
	public Planet(String name, double mass){
		this.name = name;
		this.mass = mass;
		System.out.println("Inside all args of Planet!");
	}
	
	public void orbit() {
		//orbit logic
		System.out.println("I'm orbiting: " + this.name);
	}
	
	public void crash() {
		//crash logic 
		System.out.println("I'm crashing: " + this.name);
	}
	
	public void spin() {
		//spin logic 
		System.out.println("I'm spinning: " + this.name);
	}

}
