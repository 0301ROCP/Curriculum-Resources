package com.revature.threads;

public class CustomThread extends Thread{

	@Override
	public void start() { //All it is meant to do, is to invoke the run()!!!
		super.start(); //contains all the fancy logic to treat this as a thread. 

 // Start is not a multithreading method!!!!! 
 // The start(), in our case our main thread is invoking it. 
//		while(true) { 
//			System.out.println("Apples!");
//		}
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello! I'm running in a custom thread!!!");
		}
			
	}
}
