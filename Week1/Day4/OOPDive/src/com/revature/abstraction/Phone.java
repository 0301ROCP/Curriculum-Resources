package com.revature.abstraction;

public abstract class Phone {
	
	/*
	 * 
	 * What is an abstract class?
	 * 		Partial abstraction 
	 * 
	 * You can have concrete methods in an abstract class! (unlike an interface***)
	 * 
	 * An abstract class doesn't need an abstract method!
	 * 
	 * (Abstract class and a class act very similar)
	 * 
	 * A class cannot extend multiple classes!
	 * 
	 * Abstract classes can also have constructors!
	 * 
	 * Abstract Class is a class, that can't be instantiated and may contain abstract methods!
	 */
	
	
	
	public Phone() {
		System.out.println("This is a phone!");
	}
	
	public void turnOn() {
		/*
		 * Allows me to implement my own logic!
		 */
	}
	
	public void securityMethod() {
		/*
		 * I can implement this method, so my child classes don't have to !
		 */
	}
	
	public abstract void turnOff(); //unlike an interface, you have to specify the modifiers!

}
