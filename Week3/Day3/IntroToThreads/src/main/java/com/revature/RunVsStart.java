package com.revature;

import com.revature.threads.AnotherCustomThread;
import com.revature.threads.CustomThread;

public class RunVsStart {
	
	public static void main(String[] args) {
		
		Thread t1 = new AnotherCustomThread();
		
//		t1.start(); // creates a new thread, the new thread t1 will handle the run logic, the main method will do something elsE!!
		t1.run(); //This logic is in the same thread as the main thread (main method)
		
		Thread t2 = new CustomThread();
		
		t2.start();
		
	}

}
