package com.JavaBasics;

public class Simulator {

	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		
//		fc.type = "New Value";
		
//		fc.classA = new ClassA();
		
		fc.classA.greeting = "New Greeting";
		//do-able since greeting property is not final.
		
	}
}
