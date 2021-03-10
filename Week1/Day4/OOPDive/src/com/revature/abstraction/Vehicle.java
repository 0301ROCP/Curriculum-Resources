package com.revature.abstraction;

public interface Vehicle extends Machinery{
	
	/*
	 * Interface: 
	 * 		Cannot have any concrete methods*** (all methods are abstract)
	 * 
	 * 		Default all methods are 'abstract' and public. 
	 * 
	 * 		variables are by default defined as public, static and final. 
	 * 
	 * 		An interface cannot contain a constructor!
	 * 
	 * 		You can implement multiple interfaces!
	 */
	
	double pi = 3.14;
	public static final double fakePi = 3.00;
	
	void accelerate(); // Don't allow you to specify any implementation of a method. this method is also public 
	public boolean brake(int distance);
	public void turnOnEngine();
	public void turnOffEnginge();
//	public void doAFlip();

}
