package com.revature.models.vehicle;

public class Car {
	
	String makeAndModel;
	int years;
	int doors; 
	double miles; 
	String colour;
	
	
	/*
	 * A constructor is a special method that is used to instantiate an object.
	 *  A constructor DOES NOT HAVE A RETURN TYPE.
	 *  
	 *  A constructor is called when an object is created, it's invoked by the "new" keyword!
	 */
	
	
	// (implicit) DEFAULT constructor
	/*
	 * Even if a class doesn't have an explicit constructor written, theyre'll be a constructor provided 
	 * by the JVM during compile time. 
	 * 
	 * It's pretty much identical to a no-args method signature and it has no body!
	 * 
	 * If a constructor already exists, then the JVM won't provide another consturcotr!
	 */
	
	//No-args constructor!
	Car(String makeAndModel){
		
		System.out.println("Hello there! I'm in the no args constructor!");
		this.colour = "blue";
		this.makeAndModel = "Toyota Camry";
		this.doors = 4;
		this.miles = 100000;
		this.years = 10;
		//blocks of logic that can be executed!
	}
	
	//all-args constructor! (parameterized constructor - allows us to pass in arguments)
	Car(String makeAndModel,int age, int doors, double miles, String colour ){
		//object.property = argument
		this.makeAndModel = makeAndModel;
		this.years = age;
		this.doors = doors;
		this.miles = miles;
		this.colour = colour;
	}
	
	
	//Overloading!
	/*
	 * We can use methods with the same name! 
	 * 
	 * but we have to change the method signature, so that we can specify which method we want!
	 * 
	 * We've overloaded by changing:
	 * 			the number of arguments/parameters
	 * 			the parameter type
	 * 			the order
	 */
	
	//Changing the order
	void drive(double fuel, String radioStation) {
		System.out.println("I'm driving and listening");
	}
	
	void drive(String radioStation, double fuel ) {
		System.out.println("I'm listening and driving!");
	}
	
	
	double addNumbers(int a, int b) {
		System.out.println("We're inside a double argument caalculator!");
		return a + b;
	}
	
	//Changing the type
	double addNumbers(double b, double a) {
		System.out.println("We're inside a double argument caalculator!");
		return a + b;
	}
	
	//Changing the number
	double addNumbers(int a) {
		System.out.println("We're inside a single argument caalculator!");
		return 0;
	}
	String addNumbers(int a, int b, int c) {
		System.out.println("We're inside a triple argument caalculator!");
		return "1";
	}
	
	//var-args have to be at the very right of the method arguments. (can't have multiple var-args)
	int addNumbers(int r, String... r1, int...a ) {
		System.out.println("Inside var args calculator!");
		return 2;
	}
	
	double numberOperator(int operation, int...a) {
		double total = 0;
		switch(operation) {
//		case "add":
		case 0:
				/*
				 * I'll add up all the numbers
				 */
			break;
		case 1:
				/*
				 * I'll multiply all the numbers
				 */
			break;
		default:
			System.out.println("operation is invalid!");
		}
		return total;
	}
	

	void idling() {
		//blocks of logic that can be executed!
	}

}
