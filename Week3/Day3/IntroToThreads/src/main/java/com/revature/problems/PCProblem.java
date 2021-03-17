package com.revature.problems;

import java.util.LinkedList;
import java.util.Queue;

public class PCProblem {
	
	static Queue<Integer> intQuey = new LinkedList<>();
	
	public static void main(String[] args) {
		
		intQuey.add(2);
		intQuey.add(2);
		intQuey.add(2);
		
		Runnable r1 = () -> {
			//producer thread !!!
			
			while(true) {
				System.out.println("Adding number");
				intQuey.add(2);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable r2 = () -> {
			//consumer thread logic !!!
			
			while(true) {
				System.out.println("removing number!!");
				intQuey.remove();
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
