package com.revature.abstraction;

public class Ferrari implements Vehicle, SportsVehicle{
	
	//Can be considered as a object, machinery, vehicle, sportsvehicle and ferrari!

	@Override
	public void accelerate() {
	
		System.out.println("Accelerating really really fast");
		
	}

	@Override
	public boolean brake(int distance) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean brake(int distance, double brakeFluid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void turnOnEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOffEnginge() {
		// TODO Auto-generated method stub
		
	}
	
	public void beFlashy() {
		System.out.println("I'm showing off my Ferrari!");
	}

	@Override
	public void cornering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hazardLightsActive() {
		// TODO Auto-generated method stub
		
	}

}
