package com.revature.scopes;

public class WhatAreScopes {
	
	String myObjectScope = "access by any object!";
	static double pi = 3.14;
	
	void mySpecialMethod() {
		//Method Scope example
		System.out.println("Hello There!");
		String kiwi = "Kiwi";
		System.out.println(pi);
//		System.out.println(apples); apples only exists inside of the "special" main mehtod.
		
	}
	
	
	
	public static void main(String[] args) {
		
//		System.out.println(myObjectScope); //This doesn't work, because we need an object!
		
//		System.out.println(pi = 3);
		
		/*
		 * Scope: 
		 * 		Is where a variable exists
		 * 		Child scopes can reference parent scope variables!
		 * 
		 * Class scopes: 
		 * 		This is a variable that can be referenced anywhere within the class!
		 * 
		 * Object scopes: 
		 * 		Referenced by anything inside the object. 
		 * 
		 * 	Method scopes: 
		 * 		Variables can only be referenced within the method!
		 * 
		 * Block/Loop scope
		 * 		Variables can be only referenced within the block 
		 */
		
		
		//Method Scope example
		String apples = "Apples";
		
		System.out.println(apples);
//		System.out.println(kiwi); "Kiwi only exists mySpecialMethod()"
		
		WhatAreScopes o = new WhatAreScopes();
		
		o.mySpecialMethod();
		
		System.out.println(o.myObjectScope);
		
		
		//Block scope
//		int j = 0;
		// the 'i's only exist within their respective loops
//		for(int i = 0; i< 10;i++) {
//			System.out.println(i);
//			System.out.println(j++);
//			System.out.println(pi);
//			
////			for(int i = 0; i< 10;i++) { //This is not allowed, because the nested for loop is inisde a for loop where "i" exists. 
////				
////			}
//		}
//		for(int i = -10; i< 10;i++) {
//			System.out.println(i);
//			System.out.println(j++);
//		}
//		for(int i = -20; i< 10;i++) {
//			System.out.println(i);
//			System.out.println(j++);
//		}
//		
//		while(true) {
//			int i = 7; //i only exists within the while block. 
//			break;
//		}
//		
//		System.out.println(j);
		
		
		
	}

}
