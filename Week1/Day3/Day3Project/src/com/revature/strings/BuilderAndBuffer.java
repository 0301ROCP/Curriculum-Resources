package com.revature.strings;

public class BuilderAndBuffer {
	
	public static void main(String[] kiwis) {
		
		/*
		 * StringBuilder and StringBuffer
		 */
		
		//Traditional Object
		Potatoe p1 = new Potatoe();
		p1.name = "Sweet Potatoe";
		
		Potatoe p2 = p1;
		p2.name = "Not sweet potatoe";
		
		System.out.println(p1.name);
		
		
		//String 
		String s1 = "A string";
		
//		String s2 = s1;
		String s2 = "A string"; //checks the string pool to see if this string literal exists 
		
		s2 = "Another1 string";
		s2 = "Another2 string";
		s2 = "Another3 string";
		s2 = "Another4 string";
		s2 = "Another5 string";
		s2 = "Another6 string";
		
		s2.toLowerCase();
		
		System.out.println(s2);
		
		//StringBuilder
		//Since strings are immutable, they're inefficient to use if we keep changing the string
		//StringBuilder is a mutable version of String
		
		//String and String literal.
		
		StringBuilder sb1 = new StringBuilder(s2);
		StringBuilder sb2 = new StringBuilder(sb1);
		
		sb1.reverse(); //the object is being modified as opposed to pointing to a new object. 
		sb1.insert(0, "Kiwi");
		
		System.out.println(sb2);
		System.out.println(sb1);
		
		
		//StringBuffer
		//StringBuffer is basically a StringBuilder, but with lower performance!
		//It is 'synchronized' - it is thread safe. So you can do multi-threading operations with it. 
		
		StringBuffer sBuffer1 = new StringBuffer(sb1);
		sBuffer1.reverse();
		sBuffer1.insert(0, "Kiwi");
		
		System.out.println(sBuffer1);
	}

}
