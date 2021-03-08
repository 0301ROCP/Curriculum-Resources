package com.revature.exceptions;

public class FoodDoesNotExist extends Exception{
	
	/*
	 * We've created a custom exception for our own use case!
	 */
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("We don't sell Salmon!");
		
	}
	
	public void printStackTrace(String foodName) {
		super.printStackTrace();
		System.out.println("We don't sell " + foodName);
		
	}
	

}
