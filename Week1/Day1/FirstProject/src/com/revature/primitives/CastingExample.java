package com.revature.primitives;

public class CastingExample {
	
	public static void main(String[] args) {
		
		/*
		 * 2 types of casting
		 * 
		 * 		Widening Casting
		 * 			byte -> short -> char -> int -> long -> float -> double 
		 * 			
		 * 
		 * 		Narrowing Casting
		 * 			double -> float -> long -> int -> char -> short -> byte
		 */
		
		int myIntVariable = 23;
		int myOtherInt = myIntVariable; //Same datatypes, no need to adjust the infromation. 
		
		double myDouble = myIntVariable;
		myDouble = 8.57;
		
//		boolean myBool = (boolean) myDouble; //Simply won't allow it!
		
		myOtherInt = (int) myDouble; //We're now expliciting asking it to cast from a double to an int. 
									//We're losing information when we cast this way. 
		
		System.out.println(myOtherInt);
		System.out.println(myDouble);
		
	}

}
