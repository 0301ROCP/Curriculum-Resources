package com.byMyself;

public class Casting {

	//casting can be down two ways. 
	//one is wide casting when you go from byte to short to ... to double
	// 2 is narrow casting when you go from double to byte.
	
	//Example
	public static void main(String[] args) {
		//create you variables
		int i = 9;
		double d = 10.0;
		float f = 15.5f;
		long le = 7l;
		char ele='e';
		
		//now do the wide casting
		double myd = i; //from int to double!
		float myf = le;
		int myI = ele;
		
		//now narrow casting
		int intme = (int) d;
		long inme = (long)f;
		char charme = (char) intme;
		
		//Print them out
		System.out.println(myd);
		System.out.println(myf);
		System.out.println(myI);
		System.out.println(intme);
		System.out.println(inme);
		System.out.println(charme);//lost its value

		
		
	}
}
