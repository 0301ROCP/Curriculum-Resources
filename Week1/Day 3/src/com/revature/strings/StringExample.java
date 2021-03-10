package com.revature.strings;

public class StringExample {
		
		
		/*
		 * String
		 * 		String is an object,  that contains an array of character!
		 * 		It allows us to create and manipulate strings.
		 * 
		 * The string class is immutable and the class is final.
		 * 		immutable: The string cannot be changed!
		 * 		final: the class cannot be extended.
		 * 
		 * String "Objects" are stored in the heap but string literals are stored in the string pool.
		 * 		(which is also within the heap) 
		 */
		
	
	void stringyBehaviour() {
		String a = "apples";
		String a1 = "apples";
		String a2 = "apples";
		String a3 = "apples";
		String a4 = "apples";
		String a5 = "apples";
		String a6 = "apples";
		String a7 = "apples";

		
		String copyA = "apples";
		String copyB = new String("apples");
		
		String newString = a1+a2; //this works fine!
		
		System.out.println(copyA); System.out.println(copyA.toString());

		
		Object o = new Object();
		
		Object objCopyA = o;
		Object objCopyB = new Object();
		
		Potato yellow = new Potato();
		Potato sweet = new Potato();
		
//		Potato combined = yellow + sweet;
		
		
	}
	
	public static void main(String[] apples) {
		
		String myString = "This is my String!";
		
		//When a new String "Object" is created, it checks to see if the string pool already has the string literal values
		
		String myOtherString = "This is my other string";
		//Me telling java, I don't care whether it exist, create a new one in memory!
		
		String a = "This is my String!"; //Checks whether it exist
		String b = new String ("This is my String!"); //creates a new one regardless!
		char d = 'a';
		
		
		System.out.println(a == myString); //we're actually comparing memory location!
		System.out.println(b == myString);
//
//		
//		//how do we actually compare Strings then?
		System.out.println(b.equals(myString));
		System.out.println(a.equals(myString));
//		
		
		//Strings cannot be modified, instead "modified" versions are created in memory
		//This is to stop other reference variables from being affected.
		
//		System.out.println(a.substring(6, 12)); 
//		System.out.println(a.toLowerCase());
//		System.out.println(a.toUpperCase());
		
//		a =a.substring(6);// 1 argument substring method
//		a =a.substring(6,12);//starting and ending point
//		
//		a.concat(" ");
//		a.split("");
//		a.isEmpty();
//		
//		System.out.println(a);
//		System.out.println(b);
	}
	
}
