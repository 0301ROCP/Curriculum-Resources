package com.revature.modifiers.access;

public class Motorbike extends Car{
	
	private String name;

	public Motorbike() {
		super(0);
//		this.fuel = 0;
	}
	
	public String checkName() {
		return this.name;
	}
	
//	public double checkFuel() {
//		return this.fuel;
//	}
	
	public void addFuel() {
//		this.fuel = 100;
		super.gasPump(100);
	}
	
	protected boolean checkSuspension() {
		
		this.driversId = "Bob's";
		return this.suspension;
	}
	
}
