package com.revature.inheritance;

import com.revature.models.Food;
import com.revature.models.Fruit;
import com.revature.models.Vegetable;
import com.revature.space.models.Moon;
import com.revature.space.models.Planet;

public class InheritanceDriver {
	
	/*
	 * Inheritance: 
	 * 		A child entity inherits all the properties and methods from a parent entity 
	 * 		
	 * Why is this useful?
	 * 		Promotes code reusue
	 * 
	 * Constructors are NOT inherited!
	 * 
	 * Properties are inherited
	 * 
	 * 
	 */

	
	public static void main(String[] args) {
		
		
		//In this food example, we can reduce the amount of code by using inheritance!
		
		Food myFood = new Food(); 
		Fruit myFruit = new Fruit("Banana",1, 20);
		
		System.out.println(myFood.name);
//		System.out.println(myFruit.name);
		
		
//		
//		
//		Food myFood1 = new Food("Cucumber", 1);
//		Vegetable myVeg = new Vegetable("Cucumber", 1, 20);
//		
//		Food myFood2 = new Food("Tomatoe Soup", 1);
//		
//		//SPACE EXAMPLE - inheriting methods
//		
//		Moon myMoon = new Moon();
		
//		System.out.println(myMoon.name);
//		System.out.println(myMoon.mass);
		
//		myMoon.crash();
//		myMoon.orbit();
//		myMoon.spin();
		
//		Planet p = new Planet();
//		
//		System.out.println(p.name);
//		System.out.println(p.mass);
		
	}
}
