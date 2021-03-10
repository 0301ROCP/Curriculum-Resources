package com.revature.model.vehicle;

public class Car {
	
	String makeAndModel;
	int years;
	int doors;
	double miles;
	String colour;
	
	/*
	 * A constructor is a special method that is used to instantiate an object.
	 * A constructor DOES NOT HAVE A RETURN TYPE
	 * 
	 * A constructor is called when an object is created, it's invoked by the "new" keyword!
	 * 	
	 */
	
	//(implicit) DEFAULT constructor
	/*
	 * Even if a class does not have an explicit constructor written, theyre'll be a constructor provided
	 * by the JVM during compile time.
	 * 
	 * It's pretty much identical to a no-args method signature and it has no body!
	 * 
	 * If a constructor already exists, then the JVM won't provide another constructor!
	 * 
	 */
	
	//No-args constructor
	
	Car(){
		
		System.out.println("Hello there! In the no-args constructor");
		this.colour = "blue";
		this.makeAndModel = "toyota camry";
		this.doors = 4;
		this.miles = 100000;
		this.years = 10;
		//blocks of logic that can be executed!
	}
	
	void drive(double fuel, String radioStation) {
		System.out.println("Im driving and listening");
	}
	
	void drive(String radioStation, double fuel) {
		System.out.println("Im driving and listening");
	}
	
	void idling() {
		//blocks of logic that can be executed!

	}
	
	//args constructor!
	Car (String makeAndModel, int age, int doors, double miles, String colour){
		//object.property = argument
		this.makeAndModel = makeAndModel;
		this.years=age;
		this.doors = doors;
		this.miles = miles;
		this.colour = colour;
	}
	
	int addNumbers(int...a) {
		System.out.println("Inside var args calculator!");
		return 2;
	}
	
	int addNumbers(int a, int b) {
		System.out.println("We're inside a double argument calculator!");

		return a+b;
	}
	
	//This doesn't work properly
//	double addNumbers(int a, int b) {
//		System.out.println("We're inside a double argument calculator!");
//
//		return a+b;
//	}
	String addNumbers(int a) {
		System.out.println("We're inside a single argument calculator!");
		return "1";
	}
	int addNumbers(int a, int b, int c) { 
		System.out.println("We're inside a triple argument calculator!");

		return 1;
	}
	

}
