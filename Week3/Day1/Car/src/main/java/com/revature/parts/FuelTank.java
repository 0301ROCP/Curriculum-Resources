package com.revature.parts;

public class FuelTank {
	
	//does my fuel tank satisfy the minimum viable product? What are some important method I'm missing?
	// (What happens if I run out of fuel??)
	
	private double fuel = 1;
	
	public boolean checkFuel() {
		if(fuel < 0) {
			
			throw new RuntimeException();
		}else if(fuel == 0.0) {
			return false;
		}else {
			return true;
		}
	}
	
	public void burnFuel() { //everytime I burn a single unit of fuel 
		this.fuel -= 1; 
	}

}
