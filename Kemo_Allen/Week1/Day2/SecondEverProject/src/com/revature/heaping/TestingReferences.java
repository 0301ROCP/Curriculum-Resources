package com.revature.heaping;

public class TestingReferences {
	
	public static void main(String[] args) {
		
		
		//Pass by value 
		//I only pass a copy of the stored value, I'm not pointing to the same hting!
		
		int anotherNumber = 1;
		int bravoNumber = anotherNumber;
		
		bravoNumber = 20;
		
//		System.out.println(anotherNumber);
//		System.out.println(bravoNumber);
		
		
		
		//Pass by reference 
		//
		Test b = new Test("Bravo");
		Test e = new Test("Echo");
		
		b = e;
		Test c = b;
		
		c.name = "new name";
		c = new Test("Something");
		
		
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(e.name);
		
		while(true) {
			new Object();
			System.out.println("Hi garbage collector!");
		}
		
	}

}
