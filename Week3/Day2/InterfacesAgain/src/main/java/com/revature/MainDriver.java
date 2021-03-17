package com.revature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.revature.functional.AVeryBasicCalculator;
import com.revature.functional.Car;
import com.revature.functional.Motorbike;

public class MainDriver {
	
	/*
	 * 
	 * What is an Interface?
	 * 
	 * 		A contract, that tells you what you need to do and not how to! (Abstraction)
	 * 
	 * 		We have to use the implements keywords, we can implement multiple interfaces on a single class. 
	 * 		(or use a single interface to extend multiple interfaces)
	 * 
	 * 		Methods : have implicit modifiers such as public, abstract (not concrete)
	 * 
	 * 		variables: have implicit modifiers such as public static final 
	 * 
	 * 		Interfaces DONT HAVE CONSTRUCTORS 
	 * 
	 * 		AC vs Interfaces:
	 * 		
	 * 			AC can have concrete methods (by default)
	 * 			AC have Constructors 
	 * 			AC don't have any implicit modifiers on their variables or methods. 
	 * 
	 * 
	 * 
	 * 		3 Types of Interfaces: 
	 * 
	 * 		Marker Interface :
	 * 
	 * 			Has no methods to implement. This is used to "mark" the interface in a IS-A relationship. 
	 * 
	 * 			e.g. Serializable
	 * 			In the case of serializable, it tells the JVM that this entity is expected to be serialized.
	 * 				(when an object is converted into and from bytecode - sometimes for storing in a file)
	 * 
	 * 		Functional Interface : 
	 * 
	 * 			Have 1 and ONLY 1 method to implement!
	 * 
	 * 			e.g. Comparator
	 * 			In this case, the comparator is used to compare 2 objects. We only need a compare method!
	 * 
	 * 		(Normal) Interface :
	 * 			
	 * 			An interface with 2 or more methods to be implemented!
	 * 
	 * 		
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Functional programming!
		 * 
		 * 	Treats functions as more of a 1st class entity. The focus is more on stand alone functions!
		 * 
		 * OOP:
		 * 	OOP is great! We can levarage OOP pillars to benefit our code!
		 * 	BUT for me to do a simple task (i.e. a function) - I need a class/object appended to it!
		 */
		
		
		//My Car is a functional interface!
		
//		Car c = new Jaguar(); I'll have to define a Jaguar class that extends Car 
		
		//lambdas: 
		// lambda expression consists of an arrow : ( type1 arg1, type2 arg2, etc..) -> { //method block logic};
		
		Car c = () -> {System.out.println("I'm driving!!!");};
		
		Car c2 = () -> { System.out.println("Look, I'm driving again!!!");};
		
//		c.drive();
//		c2.drive();
		
		
		AVeryBasicCalculator calc;
		
		calc = (double x, double y) -> {
								System.out.println("Here are you numbers: ");
								System.out.println("first number " + x);
								System.out.println("second number " + y);
								return x+y;}; 

		
//		System.out.println(calc.add(1, 2));
		
		
		
		Motorbike mb = new Honda();
		
		mb.wheelie(10, 10000);
		
		
		Motorbike mb2 = (double fuel, int skillz) ->
		{
			if(fuel > 0 && skillz > 9000) {
				System.out.println("I'm popping a wheelie!");
				return true;
			}
			return false;
		};
		
		mb2.wheelie(10, 1000000);
		
	
		
		//Let's say I want to compare food items
		
		List<Food> foodList = new ArrayList<>();
		
		foodList.add(new Food("Appple", 1));
		foodList.add(new Food("Kiwi", 1));
		foodList.add(new Food("Chips", 4));
		foodList.add(new Food("Chocolate", 2));
		
		
		//How would I compare 2 numbers? 
		// 2 < 3
		//  27 == 25 + 2
		
		//
		Comparator<Food> compareFoodPrice; //I want to use this interface to provide a method for comparing 2 food items
		
		compareFoodPrice = (Food f1,Food f2 ) ->{
					
			if(f1.getPrice() < f2.getPrice()) {
				//if f1 is greater than f2 then we have to provide a int greater than 0
				return 10000000;
			}else if(f1.getPrice() > f2.getPrice()) {
				//if f1 is less, then we return an int less than 0
				return -112323123;
			} else {
				//if they're the same , we return 0
				return 0;
			}
			
		};
		
		System.out.println(foodList);
		
		foodList.sort(compareFoodPrice); // Java has no idea how I want to sort my food items, could be on price, name or some other variable!!!!
	
		
		// What happens if I want to sort it by name????
		// Waht happens if I have calorie counting in my food object? Do I want to sort it out by that ? 
		System.out.println(foodList);
	}

}
