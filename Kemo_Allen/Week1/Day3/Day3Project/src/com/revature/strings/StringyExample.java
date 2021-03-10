package com.revature.strings;

public class StringyExample {
	
	/*
	 *  String 
	 *  	String is an object, that contains an array of characters!
	 *  	It allows us to create and manipulate strings. 
	 *  
	 *  The string class is immutable and the class is final.
	 *  	immutable: the string can't be changed!
	 *  	final: teh class cannot be extended. 
	 *  
	 *  String "Objects" are stored in the heap but String literals are stored in the String pool. 
	 *  	(Which is also within the heap)
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
		
		String newString = a1 + a2; // this works fine!
		
		System.out.println(copyA); System.out.println(copyA.toString());
		
		
		Object o = new Object();
		
		Object objCopyA = o;
		Object objCopyB = new Object();
		
		System.out.println(o); System.out.println(o.toString());
		
		
		Potatoe yelllo = new Potatoe();
		Potatoe sweet = new Potatoe();
		
//		Potatoe combined = yelllo + sweet;
//		System.out.println(combined.toString());
		
		
	}
	
	public static void main(String[] apples) {
		
		String myString = "This is my String!"; 
		//When a new String "object" is created, it checks to see if the String pool already has the String literal values
		
		String myOtherString = new String("This is my other string");
		//Me telling Java, I don't care whether it exists, create a new one in memory!
		
		String a = "This is my String!"; //checks whether it exists
		String b = new String("This is my String!"); //create a new one regardless 
		
		System.out.println(a == myString); // we're actually comparing memory location!
		System.out.println(b == myString);
//		
//		
//		//How do we actually compare Strings then? 
		System.out.println(b.equals(myString)); // .equals() will actually check the values of the String. 
		System.out.println(a.equals(myString));
		
		//Strings cannot be modified, instead "modified" versions are created in memory 
		//This is to stop other reference variables from being affected. 
//		System.out.println(a.substring(6, 12));
//		System.out.println(a.toLowerCase());
//		System.out.println(a.toUpperCase());
		
//		a = a.substring(6); // 1 argument substring method
//		a = a.substring(6,12); // starting and ending point!
//		
//		
//		a.concat(" ");
//		a.split(" ");
//		a.isEmpty();
//		
//		System.out.println(a);
		
		
		
		
		
		
		
		
	}

}
