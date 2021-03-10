package com.revature.datastructures;

import java.util.ArrayList;
import java.util.List;

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
	
	String[] changingArray(int[] oldArray, String newString) {
		
		String[] newArray = new String[oldArray.length + 1];
		
		/*
		 * I'd do some logic and pass in the values of the old array into the new array 
		 * 
		 * newArray[oldArray.length] = newString
		 */
		
		return newArray;
	}
	
	
	static int basicMethod() {
		return 0;
	}
	
	
	public static void main(String[] apples) {
		
		/*
		 * Collection API 
		 * 
		 * 		Called a framework (more akin to a library). Provides interfaces and classes that allow developers
		 * 		to more easily manage groups of objects!. A 'collection' object is designed to store a group of objects. 
		 * 		(Gives you a lot more flexibility than the array object) 
		 * 
		 * 
		 * 		Why?
		 * 		Array object within Java is limited to work with. Mainly, the array is immutable. 
		 * 		I could create my own custom version of a flexible array BUT it'll likely by poorly optimised!
		 * 		Secondly, it's difficlut to share data strcutures between developers!
		 * 		Standardised and optomised data structures!
		 * 
		 * 		Advantages
		 * 			Reduced effort (provides data structures and algorithms for you)
		 * 			Increases performance (more optomised)
		 * 			Encourages software reuse (provides a standard interface)
		 * 
		 */
		
		
		
		//LIST
		//String list (ctrl + shift + o)
		ArrayList<String> listOfStrings = new ArrayList<>(); //we don't need to specify the lenght of the list!
		listOfStrings.add("A new STring!");
		listOfStrings.add("A new STring2!");
		listOfStrings.add("A new STring3!");
		listOfStrings.add("A new STring4!");
		
		System.out.println(listOfStrings);
		
//		listOfStrings.get(0) = "A String!";
//		
//		basicMethod() = 2;
		
		
		String[] arrayOfString = new String[10]; 
		arrayOfString[0] = "A String!";
		
		arrayOfString[1] = "Another String";
		
	}

}
