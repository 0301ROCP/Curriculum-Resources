package com.revature.modifiers.access.other;

import com.revature.modifiers.access.Car;

public class Truck extends Car{
	
	public Truck() {
		super(100);
	}
	
	public void interactWithMyself() {
		this.suspension = true;
//		this.driversID;
	}
	
	public static void main(String[] args) {
		
		Car c =  new Car(100);
		Truck t = new Truck();
		
		t.suspension = true;
//		t.driversId; //default variables or methods are not accessible outside of package
		
		
	}

}
