package com.revature.models;

import com.revature.MainDriver;

public class Car {
	
	private double fuel; //all of my logic is built around the fact that the fuel goes from 0 -100;
	private boolean engineStatus;
	protected boolean suspension;
	String driversId; //Default
	
	public Car(double fuel) {
		this.engineStatus = false; //engine  is off by default 
		this.fuel = fuel;
	}
	
	public void startUp() {
		if(this.fuel > 0) {
			System.out.println("Engine on!");
			this.engineStatus = true;
		}else {
			System.out.println("No fuel");
		}
	}
	
	public void gasPump(double fuel) {
		if(fuel > 100) {
			System.out.println("You've put in too much, it only fills up to 100!");
			this.fuel = 100;
			//stopss from overfilling
			
		}else if(fuel < 0) {
			System.out.println("You can't take away fuel!");
			
			//removing fuel
		}else {
			
			//if all other conditions have been met, then fill up the tank!
			this.fuel = fuel;
		}
		
	}

}
