package com.revature.objects;

public class Fruit {
	
	/*
	 * Class vs Object
	 * 
	 * Class is essentially a blueprint for the instantiation of an object. Typically if you want to 
	 * 	access the methods and attributes 'within' a class, you'll need to instantiate it tino an 
	 * 	object (unless you use a static keyword)
	 * 
	 * Object is an implementation of a class. 
	 * 
	 * Object is a 'physical' entity, a class is a 'logical' entity. Memory is only allocated to the object. 
	 * 
	 * e.g. We can have a class "Human", "Ben" is an instance of the class "Human", making it an object of type 
	 * 	"Human"
	 * 
	 *   If we define a method for "Human", all humans will have access to that method.
	 *   We need an instance of the human to do it!
	 * 
	 * Function: 
	 * 		sub program that does somthing. A block of code that is executed when called upon. It consists of a 
	 * 		method signature and body. (allows reuse of blocks of code!)
	 * 
	 * Method: 
	 * 		A method is a function that is associated with an oboject. 
	 */
	
	String fruitType;
	double price; 
	
	
	//methods also follow camelcase (same as variables)
	
	void toRipe(){ //this method can be invoked using .toRipe() and will return nothing thanks to the "void 		
		/*
		 * Here's the body of code 
		 */
		System.out.println("The fruit is ripening!"); 
		
		//We can invoke a method to do something
	}
	
	
	void toRot() {
		System.out.println("The fruit is rotten!");
		
		this.fruitType = "Compost"; //"this" keyword is referencing the object's own attributes!
		
		//We can invoke a method to change the state of an object
	}
	
	void discountPrice(double newPrice) {
		this.price = newPrice;
		//We can pass in arguments to the method. 
	}
	
	double addNumbers(double notANumber, double a) { //this method will return a single value, a double 
		
		// The name we give to our parameters, really don't matter 
		// A method doesn't necesarily need to change the state of an object. 
		return notANumber + a;
	}
	
	int onlyAddInts(int a, int b) {
		return a + b;
	}
	
	
	

}
