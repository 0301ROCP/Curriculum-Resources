package com.revature.vehicles;

public class Truck extends Car{
	
	public String licensePlate;
	
	//Truck is a child of car!
	
	//What happens if we have no constructor?
	
	/*
	 * If no constructor, then a default constructor is made for us 
	 * 
	 * Truck(){
	 * 	//super(); is implicilty called inside of the default constructor!
	 *	super references a parent! In this case it is implitlicy referencing a no args constrcutor in our car!
	 * }
	 * 
	 * Truck(){ (impliclity it calls super()}
	 */
	
	
	//CONSTRUCTORS 
	public Truck() {
		super("Placeholder!",100); //So every truck that is instantiated using no args, will have name and price, "placeholder" and 100. 
		//		String hardCodeName = "Placeholder!";
	}
	
	public Truck(String name) { //this constructor belongs to the Truck class!
		
		super(name); //BEcause the car constructor does not belong to me, I have to use the super keyword!
	}
	
	/*
	 * this method can only be invoked by myself (Truck) and my child classes (motorbike)
	 * 
	 */
	
	//TRUCK SPECIFIC METHODS
	public void offRoading() {
		System.out.println("I'm offroading!!");
	}
	
	
	//INHERETED METHODS
	@Override //This is an example of an annotation! Annotations start with @
				//This is best practice, because if you aren't overriding, then this will throw a fit!
	public void drift() {
		System.out.println("I'm now driftinng annd offroading, with my 12 wheels! and other stuff");
		/*
		 * 
		 * 100s of lines of code!!!!
		 */
	}
	
	
}
