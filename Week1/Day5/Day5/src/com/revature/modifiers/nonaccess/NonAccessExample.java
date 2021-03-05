package com.revature.modifiers.nonaccess;

import com.revature.modifiers.nonaccess.Dog.DogToy;

public class NonAccessExample {
	
	public static int a = 0;
	public int b = 6; //IT IS A PROPERTY OF A NonAccessExample object!
	
	
	public static final double VALUE_OF_PI = 3.14; //best practice is use this typing conventinon
//	public static String TRAINER_NAME = "Ben";
	
	public void nonStaticMethod() {
		int height = 7;
		int area = (int) (VALUE_OF_PI*height);
	}
	
	public static void staticMethod() {
		
	}
	
	
	public class Cat{
		//The constructor the JVM provides !
		
		public void purr() {
			System.out.println("cat noises!");
		}
	}
	
	public static class Parrot{
		
	}
	
	
	public static void main(String[] args) {
		
		NonAccessExample a = new NonAccessExample();
	
		Cat fluffy = a.new Cat();
		fluffy.purr();
		
		Parrot p = new Parrot(); // because I don't need the NonAccessExample object!
		
		/*
		 * "Static" is a reserved keyword in Java. 
		 * 		It can be used with variables, methods, blocks and nested class!
		 * 
		 * Static: 
		 * 		It is now associated with the class not an object.
		 * 
		 * Our main mehtod: 
		 * 		the main method is the entry point for the jvm to start executing code!
		 * 		If it wasn't static, we would need an object, if we need an object, 
		 * 			we need code to start executing, for which we need an object for the method
		 */
		
//		nonStaticMethod();
		
		staticMethod();
		

		
		Dog mrSnuffles = new Dog("Mr Snuffles");
		mrSnuffles.jump();
		
		Dog barry = new Dog("Barry");
		barry.jump();
		
		DogToy barrysToy = barry.new DogToy();
		
//		Dog.jump();
		
		
		System.out.println(Dog.keepingTrackOfDogs());
//		System.out.println(mrSnuffles.keepingTrackOfDogs());
		
		
		
		
		//Final! keyword
		//When used on a variable cannot be changed, it means the variable cannot be reassigned!
		
//		final int apples = 7; 
//		int kiwi = 7;
//		
//		apples = 8;
//		kiwi = 8;
		
		final Dog poseidon = barry;
		barry.name = "God of Sea!";
//		poseidon = mrSnuffles; //can't be reassinged
//		TRAINER_NAME = "Bob";
//		VALUE_OF_PI = 7;
		
		
//		SportyDog swifty = new SportyDog();
//		swifty.bark();
//		swifty.jump();
		
		//inside of a class!
		
		
		//variable: cannot be reassigned
		//method: cannot be overridden 
		
		/*
		 *Can constructors can be final? 
		 *	redundnant, you don't inherit constructors! 
		 */
		
		//class: we cannot extend it!
		
		
	}

}
