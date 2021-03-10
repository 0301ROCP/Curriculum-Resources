package com.revature.vehicles;

public class Motorbike extends Truck{
	
	//Motorbike has no constructor defined
	
	//JVM provides the deafult  constructor
	
	/*
	 * Motorbike(){
	 * 	(implicilty) super(); --> It is calling the no args constructor in Truck!
	 * }
	 */
	
	Motorbike(){
		super();
	}
	
	Motorbike(int a){
		this();
	}
	
	//Override Truck method
//	@Override
//	public void drift() { 
//		System.out.println("I'm drfiting on my bike!!");
//		super.drift(); //invokes the parents method!
//		
////		return 0;
//	}
	
	//Override the CarMethod! 
//	@Override
//	public double asledkne() { //TELLING ME WHETHER IM ACTUALLY OVERRIDING!
//		
//		System.out.println("I'm overriding!");
//		return 0;
//	}
	
	public void bikeTricks() {
		super.drive();
		super.drift();
		super.drift();
		super.drive();
	
	}
	
	
	/*
	 * When overriding, the return type has to match 
	 * 
	 * Method signature has to have the same number of arguments!
	 * If you change argumetns, you're effectively overloading!
	 * 
	 */
	
}
