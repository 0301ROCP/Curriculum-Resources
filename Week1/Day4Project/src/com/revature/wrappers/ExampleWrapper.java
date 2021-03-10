package com.revature.wrappers;

public class ExampleWrapper {
	
//	static void randomFunction(int a) {
//		System.out.println("Inside int args!");
//	}
	
//	static void randomFunction(double a) {
//		System.out.println("Inside double args!");
//	}
//	
	static void randomFunction(Integer a) {
		System.out.println("Inside Double args!");
	}
	
	public static void main(String[] oranges) {
		
		int a = 7;
		randomFunction(a); //by default, a variable is going to prefer casting over autoboxing
		
		/*
		 *Primitives:
		 *		Are very simple, they are not objects!
		 *
		 * 	int
		 *  double
		 *  short
		 *  long
		 *  float
		 *  boolean
		 *  char
		 *  byte
		 *  
		 */
		
		//Wrapper Classes
		//Allow us to 'wrap' our primitives, so that they can become obejcts!
		
		Integer myInt = new Integer(9);
		Integer myOtherInt = 9;
		int myPrimInt = 9;
		
		//myPrimeInt. int has no method or properties associated with it!
		System.out.println(myInt.longValue());
		
		//Boxing is the process of converting a primitive to its wrapper class!
		
		//Autoboxing! This is implicitly done by the class, automatically!
		Double myDouble = 9.9;
		Byte myByte = 1;
		Short myShort = 2;
		Character myChar = 'a';
		Long myLong=1000l;
		Float f = 100f;
		Boolean myBool = true;
		
		//We are not casting this time! casting occurs from and to primitive values
		
		//These wrapper classes have useful static methods!
		//useful parsing methods e.g. Double.parseFromString(); (Double.parseX();)
		//.valueOf(); for primitive conversion!
	
	}

}
