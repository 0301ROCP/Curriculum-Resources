package com.revature.structure;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		/*
		 * Start introducing data structures in JAva: 
		 * 
		 * The most basic one we have is an array.
		 * 
		 * 		an array is a list of similar items that can be iterated over. 
		 * 			
		 * 		Same data types 
		 * 		Positions are indexed
		 * 		Length is immutable 
		 * 		(Iterable)
		 */
		
		
		int[] intArray = {5,4,3,2,1}; //We've declared an array, that'll store int
										//manually assigning the values and length of the array 
		
		double[] doubleArray = new double[10]; //default value is 0.0
		
		char[] charArray = {'1','b','c','k'}; //default value is ' '
		
		
		intArray = new int[5]; //assiging our int array to be of length 5! 0 - 4
								//by default the values of an int array is 0 
		
		
		intArray = new int[10];
		/*
		 * The 'new' keyword is a way of instantiating an object into memory 
		 */
		
		intArray[0] = 12;
		intArray[1] = 57;
		
//		System.out.println(intArray[2]);
//		System.out.println(doubleArray[0]);
//		System.out.println(charArray[0]);
//		System.out.println(doubleArray[0]);		
		
//		System.out.println(intArray);
//		
//		
//		
//		for(int i = 0; i < charArray.length; i = i + 2) {
//			System.out.println(charArray[i]);
//		}
//		
//		//With iterable entities, we can use an enhanced for loop. 
//		// We don't reference the positions directly, instead we reference the element itself.
//		for(char i: charArray) {
//			System.out.println(i);
//		}
//		
//		
//		//filling up the double array 
//		for(int position = 0; position < doubleArray.length; position++ ) {
//			doubleArray[position] = 7;
//		}
//		
//		
//		//printing out double array 
//		for(double element: doubleArray) {
//			System.out.println(element);
//		}
		
		
		
		
		int[] myArray = {1,2,3};
		
		myArray = new int[5];
		
//		myArray[6] = 7; This will throw an exception 
		
		
		
		for(int element: myArray) {
			System.out.println(element);
		}

	}

}
