package com.revature.problems;

import java.util.ArrayList;
import java.util.List;

public class SyncProblem {
	
	static List<Integer> integerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		integerList.add(3);
		
		Runnable r1 = () -> {
			
			while(true) {
				System.out.println("adding to number");
				for(int i = 0; i < 10; i++) {
					integerList.add(2); //add 2 to the list, 10 times!
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable r2 = () -> {
			
			while(true) {
				System.out.println("removing to number");
				for(int i = 0; i < 10; i++) {
					integerList.remove(i); //removing 2 from the list, 10 times!
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}


}
