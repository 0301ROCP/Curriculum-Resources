package com.revature.threads;

public class AnotherCustomThread extends Thread{
	
	@Override
	public void start() {
		super.start(); //contains all the fancy logic to treat this as a thread. 
		System.out.println("Hello There! I'm starting up!");
	}
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("HI OTHER THREAD!!!");
		}
			
	}

}
