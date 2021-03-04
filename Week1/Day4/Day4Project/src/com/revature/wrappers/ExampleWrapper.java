package com.revature.wrappers;

public class ExampleWrapper {
	
//	static void randomFunction(int a) {
//		System.out.println("Inside int args!");
//	}
	
//	static void randomFunction(double a) {
//		System.out.println("Inside double args!");
//	}
	
	static void randomFunction(Integer a) {
		System.out.println("Inside Double args!");
	}
	
	public static void main(String[] oranges) {
		
		int a = 7; //
		randomFunction(a); //by default, a variable is going to prefer casting over uatoboxing
		
		
		/*
		 * Primitives: 
		 * 		ARe very simple, they are not objects!
		 * 
		 * 		int 
		 * 		double
		 * 		short
		 * 		long 
		 * 		float 
		 * 		boolean 
		 * 		char 
		 * 		byte
		 */
		
		//Wrapper Classes 
		//Allow us to 'wrap' our primitives, so that tey become objects!
		
		Integer myInt = new Integer(9);
		Integer myOtherInt = 9;
		int myPrimInt = 9;
		
//		myPrimeInt. int has no method or properties associated with it!
		System.out.println(myInt.longValue());
		
		///Boxing is the process of converting a primitive to its wrapper class!
		// Autoboxing! This is implicilty done by the class, automatically!
		Double myDouble = 9.0;
		Byte myByte = 1;
		Short myShort = 2;
		Character myChar = 'a';
		Long myLong = 1000l;
		Float f = 100f;
		Boolean myBool = true;
		
		//We are not casting this time! casting occurs from and to primitive values 
		
		
		//These wrapper classes have useful static methods!
		// useful parsing methods e.g. Double.parseX();
		/// .valueOf();for primitive conversion!
		
		
		
		
		
	}

}
