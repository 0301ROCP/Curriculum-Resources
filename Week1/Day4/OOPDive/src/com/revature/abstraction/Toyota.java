package com.revature.abstraction;

public class Toyota implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("At least I'm accelerating");
		
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
	
	public void superWarranty() {
		System.out.println("Ectended warranty always good!");
	}

	@Override
	public void hazardLightsActive() {
		// TODO Auto-generated method stub
		
	}

}
