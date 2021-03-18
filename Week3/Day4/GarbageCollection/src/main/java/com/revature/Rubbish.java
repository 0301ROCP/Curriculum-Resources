package com.revature;

public class Rubbish {//implicitly will extend the Object class 
	
	public Rubbish friendRubbish;
	
	
	//final vs finally vs finalize()?
	
	
	
	public static int numberOfRubbishDestroyed = 0;
	
	@Override
	public void finalize() {
		// snippet of code that the garbage collector calls, just before it destorys the object in memory 
		// finalize() is not a destruction method - if we invoke it does not destory the object 
		// as the GC is destroying the object from memory, it calls the finalize method(). 
		
		System.out.println("Help me, I'm not referenced !!!");
		numberOfRubbishDestroyed++;
	}
	
	public void ezilanif() {
		System.out.println("A random method!!!");
		numberOfRubbishDestroyed++;
	}

	@Override
	public String toString() {
		return "I'm rubbish!";
		
	}
}
