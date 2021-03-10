package com.JavaBasics;

public final class FinalClass {

	protected final String type = "Type A";
	protected final ClassA classA = new ClassA(); //we do it this way 
	//because "ClassA classA" was giving and error we had to 
	//instantiate it.
	
	public static void main(String[] args) {
		System.out.println("Some method");
	}
	
}
