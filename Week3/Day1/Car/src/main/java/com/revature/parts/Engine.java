package com.revature.parts;

public class Engine {
	
	// my engine only requires a fuel tank with some fuel on it to work 
	// every time I turn the engine on, I burn a little fuel! Will this cause any issues with my project logic??

	
	private FuelTank fuelTank;
		
	public Engine(FuelTank fuelTank) {
		super();
		this.fuelTank = fuelTank;
	}

	public boolean turnOnEngine() {
		
		fuelTank.burnFuel();
		
		if(this.fuelTank.checkFuel()) {
			return true; 
		}else {
			return false;
		}
		
	}

}
