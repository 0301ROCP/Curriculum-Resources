package com.revature.primitives;

public class PrimitiveExample {
	
	public static void main(String[] args) {
		
		
		//Primitives - the most basic things you can get in Java
		//The role of a primitive is to only store a value
		
		/*
		 * Classes: Titlecase
		 * packages: lowercase
		 * variables (and methods): camelcase
		 */
		
		//Strongly typed: 
		// every avriable we "declare" has to be of a certain data type. 
		
		//Java doesn't really see empty spaces
		
		int firstVariable; //declaration , we declared an int variable of name "firstVariable"
		
		firstVariable = 13; //assignment, we've assigned a value
//		System.out.println(firstVariable);
		//Once a variable is declared to be a type, it's type can't be changed. 
//		boolean firstVariable;
//		firstVariable = true;
		firstVariable = 26; //reassignment!
		
		//String isn't primitive
		//This is a list of all the primitive values you can have in Java. 
		//They all have their own memory allocation. 
		int intVariable = 1001; // 32 bits - 4 bytes
		
		char charVariable = 97; // 16 bits - 2 bytes
//		charVariable = 'a';
		
		double doubleVariable = 100.102; // 64 bits - 8 bytes
		
		float floatVariable = 0.73f; // 32 bits - 4 bytes
		
		boolean boolVariable = false;// theoretically 1 bit - thanks to the way java stores memory, it's a byte
		
		byte byteVariable; //byte - 8 bits
		long longVariable; // 64 bits - 8 bytes
		short shortVariable; // 16 bits - 2 bytes
		
//		System.out.println(26);
//		System.out.println(firstVariable);
		
		System.out.println(floatVariable);
		
		
		
	}

}
