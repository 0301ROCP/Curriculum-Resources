package com.revature.models;

public class Planet {
	
	/*
	 * POJOs - Plain Old Java Objects
	 * They're meant to be very simple entities. 
	 * Store and keep track of attirbutes, that's their primary purpose. 
	 * 
	 * 
	 * Encapsulation: 
	 * 		We want to restrict access to  important information!
	 * 		To ensure data isn't modified without apporpriate validation!.
	 * 
	 * private variables and public getters and setters. 
	 */
	
	private String name;
	private double mass;
	private boolean rings;
	
	public Planet(){
		
	}
	
	public Planet(String name, double mass, boolean rings){
		this.name = name;
		this.mass = mass;
		this.rings = rings;
	}

	//A getter and a setter for our name attribute!
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public boolean isRings() {
		return rings;
	}

	public void setRings(boolean rings) {
		this.rings = rings;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", mass=" + mass + ", rings=" + rings + "]";
	}
	
	
	
}
