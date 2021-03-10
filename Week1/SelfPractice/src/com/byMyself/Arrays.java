package com.byMyself;

public class Arrays {
	
	//Arrays are used to store multiple variables in a single variable
	
	public static void main(String[] args) {
		
		//Create the array 
		
		//single element array
		String[] cat = {"meow"};
		
		//multiple element array
		int[] numbers = {1,2,3,4,5,6};
		
		//printing the array
		System.out.println(cat);
		System.out.println(numbers); //only prints the location memory
		
		//printing the value of array
		System.out.println(cat[0]);
		System.out.println(numbers[1] + numbers[3]);
		
		//looping an array using for
		for(int i  = 10; i >= numbers.length; i--) {
			System.out.println(i);
		}
		
		//looping an array using enhanced for
		for (String c: cat) {
			System.out.println(c);
		}
		
		//multidimension array
		
		int[][] MyNum = {{1,2,3},{10,11,12,13}};
		
		System.out.println(MyNum[1][1]);
	}
}
