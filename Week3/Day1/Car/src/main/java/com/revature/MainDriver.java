package com.revature;

import com.revature.parts.Engine;
import com.revature.parts.FuelTank;
import com.revature.parts.Tire;
import com.revature.vehicle.Car;

public class MainDriver {
	
	public static void main(String[] args) {
		
		/*
		 * I've written a Car class that contains basic engine parts
		 * 
		 * The code is terrible. 
		 * 
		 * I'd like you to try to debug this code and refactor it to follow better coding practice and more importantly make it work!
		 * 
		 * I've put comments with each engine to describe what it's meant to do!
		 * 
		 * Try to decide what the parts should do -> create unit tests that fit your criteria -> then refactor the code! 
		 * 
		 */
		
		Tire tire = new Tire(20);
		FuelTank fuelTank = new FuelTank();
		Engine engine = new Engine(fuelTank);
		
		
		Car car = new Car(engine, tire);
		
		
		car.drive();
		
		
		
		
		
		
	}

}
