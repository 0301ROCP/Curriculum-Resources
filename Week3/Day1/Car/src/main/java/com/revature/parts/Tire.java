package com.revature.parts;

public class Tire {
	
	//A tire works fine if you have pressure equal to or more than 20
	// I have provided a verification method 
	
	private double pressure = 0;
	
	public Tire(double pressure) {
		super();
		pressure = pressure;
	}


	public boolean checkTyrePressure() {
		if(pressure > 20) {
			return false;
		}else if( pressure <20) {
			return false;
		} else {
			return true;
		}
	}

}
