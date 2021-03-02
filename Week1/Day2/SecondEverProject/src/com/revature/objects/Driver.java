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
		
		Fruit myFruit = new Fruit();
		Fruit myFruit2 = new Fruit();
		
//		myFruit.toRipe(); //this right here is invoking a method in the object 
		
		myFruit.fruitType = "Apples";
		myFruit.price = 1;
		
//		myFruit.toRot();
//		myFruit.toRot();
//		myFruit.toRot();
//		myFruit.toRot();
//		myFruit.toRot();
//		myFruit.toRot();
//		myFruit.toRot();
//		myFruit.discountPrice(0); //Now that the fruit has rotted away, the price is equal to 0;
//		
//		System.out.println(myFruit.fruitType);
//		System.out.println(myFruit.price);
//		
//		myFruit2.discountPrice(20);
//		myFruit2.toRot();
		
//		double myBigDouble = myFruit2.addNumbers(10, 0); //implicitly cast from int to double 
//		
//		System.out.println( myBigDouble);
//		
//		double dummy1  = 0.1;
//		double dummy2 = 7.5;
//		
//		myFruit.addNumbers(dummy1, dummy2);
//		myFruit.onlyAddInts((int) dummy1, (int) dummy2); //in this case we're trying to cast from double -> int
														// we're losing information, so we have to expliclity tell it to cast. 
		
//		System.out.println(myFruit.toString());
		
		
		Human myHuman = new Human(); // We've effectively instantiated an empty human 
		Human myHuman2 = new Human(); //We've created another memory space, and filled it with another human. 
		
		Human myHuman3 = new Human(); 
		myHuman3.name = "Stevey"; 
		
		myHuman3 = myHuman; // We lose any ability to reference Human3, Stevey. 
		
//		myHuman.age = 102;
//		myHuman.height = 200;
//		myHuman.weight = 200;
//		myHuman.name = "Bobby";
		
		myHuman.toMakeABobby(102, 200, 200);
		myHuman.myShoes = new Shoe[10]; // I lose the reference to the original array 
										// the original array had references to the 3 shoes 
										// by extension, I lose reference to the shoes as well. 
		

		
//		myHuman.givingDetails();
//		myHuman2.givingDetails();
		
		myHuman.pimpMyShoes();
//		myHuman.showOfMyShoes();
		
		int[] myNumbers = {10,20,30,40,0,100};
		
		int sum = myHuman.onlyAddInts(myNumbers); //this is a method invocation line, it will only accept the correct arguments
		
		double myDoubleSum = myHuman.addMyArgs(10,20,30,40,50);
		
		System.out.println(sum);
		System.out.println(myDoubleSum);
		
//		myHuman3.name = "Franky";
		
//		System.out.println(myHuman.name); //Franky  
//		System.out.println(myHuman2.name); //null    
//		System.out.println(myHuman3.name); //Franky  
		
//		System.out.println(myHuman.organs);
//		
//		for(String organ: myHuman.organs) {
//			System.out.println(organ);
//		}
		
	}

}
