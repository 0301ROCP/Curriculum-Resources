package com.revature.models;

import com.revature.MainDriver;

public class Car {
	
	public void invalidMethod() {
		
		MainDriver.anotherInvalidMethod();
	}
	
	private String name;
	private double fuel;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, double fuel) {
		super();
		this.name = name;
		this.fuel = fuel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", fuel=" + fuel + "]";
	}
	
	

}
