package com.revature.vehicles;

public class Car { //explicilty it is not the child of anything, but everything in Java is a child of Object Class 
	
	public String name;
	public double price;
	
	public Car() {
		
	}
	
	public Car(String name) {
//		super();
		//This allws me to create a car, with just a name
		this.name = name;
		
	}
	
	public Car(String name, double price) {
//		super();
		this.name= name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println("I'm driving!");
	}
	
	public void drift() {
		System.out.println("I'm drfiting all over the place!");
	}
	
	public double aasdfekle() {
		System.out.println("hello!");
		return 0;
	}

}
