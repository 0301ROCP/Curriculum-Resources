package com.revature.abstraction;

public class Lexus implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Accelerating really  fast");
		
	}

	@Override
	public boolean brake(int distance) {
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
	
	public void turnOnGadgets() {
		System.out.println("I'm turning on my gadgets!");
	}

	@Override
	public void hazardLightsActive() {
		// TODO Auto-generated method stub
		
	}

}
