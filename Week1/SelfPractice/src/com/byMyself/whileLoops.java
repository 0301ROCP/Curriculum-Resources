package com.byMyself;

public class whileLoops {
	
	//While loop: while(condition) {}
	
	public static void main(String[] args) {
		
		//variables
		int i = 5;
		
		while(i < 7) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
	}

}
