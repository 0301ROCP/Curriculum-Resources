package com.revature.abstraction;

public class MainDriver {
	
	/*
	 * Abstraction:
	 * 		The concept of hiding implementation to show funcitonality!
	 * 		(A key turn, will turn on the engine, but I don't know how it works under the hood)
	 * 
	 * In Java we have 2 entities: 
	 * 		Interface (Complete Abstraction)
	 * 		Abstract Class (Partial Abstraction
	 * 		
	 */
	
	void parkMyCar(Vehicle v) {
		v.accelerate();
		v.brake(10);
		v.turnOffEnginge();
	}
	
	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle(); Not allowed, does not have a constructor!
		
		
		SportsVehicle v = new Ferrari();
		Vehicle v1 = new Ferrari();
		
		Machinery m1 = new Ferrari();
		Machinery m2 = new Lexus(); 
		
		
		Vehicle v2 = new Lexus();
		Vehicle v3 = new Toyota();

		
		Ferrari f = new Ferrari(); //An object, vehicle and a ferrari 
		
		v1.accelerate();
//		v1.brake(100, 10);
		v2.brake(100);
		v1.turnOnEngine();
		v3.turnOffEnginge();
		
		
		//Abstract Class example
		//AC have constructors, you still cannot instantiate
		//Both of these are phones! except now the turnOn() method should be the same for both!
		Phone p = new IPhone();
		Phone p2 = new Andriod();
		
		
	
		
	}

}
