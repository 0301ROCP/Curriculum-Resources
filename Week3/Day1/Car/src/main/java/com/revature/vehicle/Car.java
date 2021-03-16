package com.revature.vehicle;

import com.revature.parts.Engine;
import com.revature.parts.Tire;

public class Car {
	
	
	//For my car to work, all my parts have to work!
	// The engine should have fuel inside it!
	// The tire pressure should be at least 20
	// If these conditions have been met, I should be able to invoke the drive method on my car!

	
	private Engine engine;
	private Tire tire;
	
	
	
	
	public Car(Engine engine, Tire tire) {
		super();
		this.engine = engine;
		this.tire = tire;
	}

	private boolean turnOnEngine() {
		if(this.turnOnEngine() && this.tire.checkTyrePressure()) {
			return true;
		}
		return false;
	}


	public boolean drive() {
		
		if(this.turnOnEngine()) {
			System.out.println("We're driving !!!");
			return true;
		}else {
			System.out.println("Engine is not working!");
			return false;
		}
		
	}
	
	
	

}
