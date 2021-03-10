package com.revature.scopes;

public class WhatAreScopes {
	
	String myObjectScope = "access by any object!";
	static double pi = 3.14;
	
	void mySpecialMethod() { //method
		System.out.println("Hello There");
		String kiwi = "kiwi";
		System.out.println(pi);
//		System.out.println(apples); apples only exist inside of the "special" main method.
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(myObjectScope);//This doesn't work, because we need an object
		
		System.out.println(pi);
		
		
		/*
		 *  Scope: 
		 *  	Is where a variable exists
		 *  	Child scopes can reference parent scope variables!
		 *  
		 *  Class scopes:
		 *  	This is a variable that can be referenced anywhere within the class!
		 *  
		 *  Object scopes:
		 *  	Referenced by anything inside the object
		 *  
		 *   Method scopes:
		 *   	Variables can only be referenced within the method!
		 *   
		 *   Block/Loop scope
		 *   	Variables can only be referenced within the block
		 */
		
		String apples = "Apples";
		
		System.out.println(apples);
//		System.out.println(kiwi);"kiwi" only exists in mySpecialMethod()
		
		WhatAreScopes o = new WhatAreScopes(); //object
		
		o.mySpecialMethod();
		
		System.out.println(o.myObjectScope);
		
		
		//Block scope
		
		int j = 0;
		// the 'i's only exist within their respective loops
		for( int i = 0; i < 10 ; i++) {
			
			System.out.println(i);
			System.out.println(j++);
			System.out.println(pi);
			
//			for(int i = 0; i< 10;i++) {//This is not allow, because the nested for loop is inside the for loop
//				
//			}
		}
		for( int i = -10; i < 10 ; i++) {
			System.out.println(i);
			System.out.println(j++);
		}
		for( int i = -20; i < 10 ; i++) {
			System.out.println(i);
			System.out.println(j++);
		}
		
		while(true) {
			int i = 7; // i only exists within the while block.
		break;
		}
		
	}

}
