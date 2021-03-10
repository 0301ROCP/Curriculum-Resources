package com.byMyself;

public class methods {
	
	//Methods is a block of code which only runs when it is called.
	
	//create a method
	public static void myMethod() { //using static means it belongs to main 
									//class and not an object of the main class. 
		int i=10;
		System.out.println(i);
	}
	
	public static void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	//another method
	public static void Spongebob() {
		System.out.println("Patrick");
	}
	
	//String method
	public static void Squidward(String name) {
		System.out.println(name + "Tentacles");
	}
	
	//no void method
	public static double multiply(double dd, double ee) {
		
		return 5*dd*ee;
	}
	
	//if/else method
	static void priceCheck(double price) {
		if (price > 0) {
			System.out.println("The is affordable");
		} else if (price > 100) {
			System.out.println("This is expensive");
		}else {
			System.out.println("I need a price check");
		}
	}
	
	//method overloading method
	static int OverloadingMethod(int n1, int n2) {
		return n1+n2;
	}
	
	static double OverloadingMethod(double n1, double n2) {
		return n1 + n2;
	}
	
	
	static void MySMethod() {
		System.out.println("Static");
	}
	
	public void MyP() {
		System.out.println("Public");
	}
	
	
	
	public static void main(String[] args) { //Main method 
		
		//We also call other methods inside the main method
	
		myMethod(); //calling a method
		
		//without a method Addition Example:
		int a = 4;
		int b = 3;
		System.out.println(a+b);
		
		int c = 8; //have to change variable names and  put different values to get more answers
		int d = 6;
		System.out.println(c+d);
		
		//with a method addition example:
		addition(4,3);
		addition(500,3);
		addition(4,300);
		
		//calling the spongebob method
		Spongebob();
		
		//Method parameters 
		Squidward("Squidward ");
		
		//Method without void
		System.out.println(multiply(4.0,7.0));
		
		//Method with if/Else 
		priceCheck(20);
		
		//MethodOverloading
		int Over1 = OverloadingMethod(20,50);
		double Over2 = OverloadingMethod(20.55,40.7789);
		System.out.println(Over1);
		System.out.println(Over2);
		
		//Static method
		MySMethod();
		
		//non-static method
		methods MyPMethod = new methods(); //create an object for non static method
		MyPMethod.MyP(); //Call the method
		
		//calling a method from another class
		anotherMethod ANewMethod = new anotherMethod(); //use the other class to create an object
		ANewMethod.AMethod();
		
		
	}

}
