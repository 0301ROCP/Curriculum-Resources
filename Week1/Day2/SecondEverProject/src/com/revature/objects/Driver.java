package com.revature.objects;

public class Driver {
	
	/*
	 * When you have a project, you will only have a single main method. 
	 * 
	 * This main method is typically stored within the class called 'Driver'
	 */
	
	public static void main(String[] args) {
		
		
		/*
		 * Is a template for an object 
		 * 
		 * An object is an instance of a class. 
		 * 
		 */
		
//		Fruit myFruit = new Fruit();
//		
//		myFruit.fruitType = "Apples";
//		myFruit.price = 1;
//		
//		myFruit = new Fruit();
//		
//		System.out.println(myFruit.fruitType);
//		System.out.println(myFruit.price);
//		
//		System.out.println(myFruit.toString());
		
		
		Human myHuman = new Human(); // We've effectively instantiated an empty human 
		Human myHuman2 = new Human(); //We've created another memory space, and filled it with another human. 
		
		Human myHuman3 = new Human(); 
		myHuman3.name = "Stevey"; 
		
		myHuman3 = myHuman; // We lose any ability to reference Human3, Stevey. 
		
		myHuman.age = 102;
		myHuman.height = 200;
		myHuman.weight = 200;
		myHuman.name = "Bobby";
		myHuman.myShoes = new Shoe[10]; // I lose the reference to the original array 
										// the original array had references to the 3 shoes 
										// by extension, I lose reference to the shoes as well. 
//		
//		
//		
		myHuman3.name = "Franky";
		
//		System.out.println(myHuman.name); //Franky  
//		System.out.println(myHuman2.name); //null    
//		System.out.println(myHuman3.name); //Franky  
		
		System.out.println(myHuman.organs);
		
		for(String organ: myHuman.organs) {
			System.out.println(organ);
		}
		
	}

}
