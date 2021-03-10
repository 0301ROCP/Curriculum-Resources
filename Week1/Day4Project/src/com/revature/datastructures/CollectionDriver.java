package com.revature.datastructures;

import java.util.ArrayList;

public class CollectionDriver {

	 int[] changingArray(int[] oldArray, int newLength) {

		 int[] newArray = new int[newLength];
		 
		 /*
		  * I'd do some logic and pass in the values of the old array into the new array
		  * 
		  * newArray[0] = oldArray[0]
		  */
		 
		return newArray;
	}
//	 String[] changingArray(int[] oldArray, String newString) {
//	 
//		 String[] newArray = new String [oldArray];
//	
//		 /*
//		  * I'd do some logic and pass in the values of the old array into the new array
//		  * 
//		  * newArray[0] = oldArray[0]
//		  */
//		 
//		return oldArray;
	
	public static void main(String[] args) {
		
		
		/*
		 * Collection API
		 * 
		 * A collection of item! A list, a flexible array, a map
		 * 
		 * 		called a framework (more akin to a library). Provides interfaces and classes that allow developers
		 * 		to more easily manage groups of objects! A 'collection' object is designed to store a group of objects.
		 * 		(gives you a lot more flexibility that the array object)
		 * 
		 * 
		 * 		why?
		 * 		Array object within java is limited to work with. Mainly, the array is immutable.
		 * 		I could create my own custom version of a flexible array BUT it'll likely be poorly optimized!
		 * 		Secondly; it's difficult to share data structures between developers!
		 *		Advantages:
		 *			Reduced effort(provides data structures and algorithms for you)
		 *			Increases performance (more optimized)
		 *			Encourages software reuse (provides a standard interface)
		 */
		
		//LIST
		//String list (ctrl + shift + o)
		ArrayList<String> listOfStrings = new ArrayList<>(); //We don't neeed to specify the length of the list!
		listOfStrings.add("A new String!");
		listOfStrings.add("A new String2!");
		listOfStrings.add("A new String3!");
		listOfStrings.add("A new String4!");
		
		System.out.println(listOfStrings);

		
//		listOfStrings.get(0) = "A String!";
		
		String[] arrayOfString = new String[10];
		arrayOfString[0] = "A String!";
	
		arrayOfString[1] = "Another String";
	}
}
