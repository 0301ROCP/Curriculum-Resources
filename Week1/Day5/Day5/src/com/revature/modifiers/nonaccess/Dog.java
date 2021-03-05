package com.revature.modifiers.nonaccess;

public final class Dog { //this will stop the class from being extended!
	
	public class DogToy{
		
	}
	
	Dog(){
		numberOfDogs++;	
	}
	
	Dog(String name){
		this.name = name;
		numberOfDogs++; //Every time a dog is instantiated
						// we add to number of Dogs
	}
	
	public String name;
	public static int numberOfDogs = 0;
	
	public void jump() {
		System.out.println(this.name + " is jumping!");
	}
	
	public final void bark() {
		System.out.println("MAking Dog noise");
	}
	
	public void securityMode() {
		this.bark();
	}
	
	public static int keepingTrackOfDogs() {
		
		//A static method, cannot reference an instance variable
		return numberOfDogs;
	}

}
