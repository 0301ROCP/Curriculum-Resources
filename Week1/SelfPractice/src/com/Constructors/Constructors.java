package com.Constructors;

public class Constructors {
	
	//Constructors do no have return types.
	
	//Default constructor
	public Constructors() {
		System.out.println("Default constructor ran");
	}
	
	//Created int constructor
	public Constructors(int value) { //This is a constructor(not a default one) with integers.
		System.out.println(value);
	}

	public static void main(String[] args) {
		//create instances here
		Constructors c = new Constructors(0); //have to put an integer inside the parentheses.
	
	//Use the no-arg Constructor
		Constructors cNoArg = new Constructors(); //will run the default constructor system.out line
	}
}
