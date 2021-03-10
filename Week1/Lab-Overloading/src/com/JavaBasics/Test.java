package com.JavaBasics;

public class Test {

	
	public static void main(String[] args) {
		A a= new A();
		
		System.out.println(a.instanceCount);
//		System.out.println(a.staticCount);

		System.out.println(A.staticCount);
		//"staticCount" is underline yellow since we are trying to access
		// the member from an instance of A.
		
		//Use capital A instead of lowercase a.
		
		A a2= new A();
		
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		/*Output
		 * 1- instanceCount for a
		 * 1- staticCount for the class A
		 * 1- instanceCount for a2
		 * 2- staticCount for the class A
		 */
		
		/*
		 * Instance members are associated to an object that is saved in memory.
		 * static does not affect the instance ones.
		 */
		a.setInstanceCount(15);
		System.out.println("Object a instanceCount" + a.instanceCount);
		System.out.println("Object a2 intanceCount" + a2.instanceCount);
		
		A.setStaticCount(2494);

	    System.out.println("class A staticCount: " + A.staticCount);
	}
}
