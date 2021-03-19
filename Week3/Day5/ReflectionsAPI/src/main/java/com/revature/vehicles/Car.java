package com.revature.vehicles;

public final class Car {
	
	public String name;
	private double fuel;
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Car(String name) {
		super();
		this.name = name;
	}

	public Car(String name, double fuel) {
		super();
		this.name = name;
		this.fuel = fuel;
	}

	public void drive() {
		System.out.println("I'm driving, inside a public, no args method.");
	}
	
	public double drift(String a, double b) {
		System.out.println("I'm drifiting, inside a public, paramenterized method");
		return 0;
	}
	
	private void superSecret() {
		System.out.println("This is inside my private method!");
	}

}
