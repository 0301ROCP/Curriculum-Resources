package com.revature.vehicles;

public class Tricycle extends Car{
	
	//Tricycle has no constructor defined
	
		//JVM provides the deafult  constructor
		
		/*
		 * Tricycle(){
		 * 	(implicilty) super(); --> It is calling the Car's no args constructor!
		 * }
		 */
	
	//Trycicle specific method

	public void popAWheelie(String name) {
		System.out.println("Doing cool tricks!");
//		return 0;
		
		
	}
	
	/*
	 * Nothing else will have access to the wheelie method!
	 * 
	 * methods and properties aren't accesible to parent entities and sibling entities!
	 */

}
