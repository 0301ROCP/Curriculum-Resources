package com.revature.control;

public class ExampleFor {
	
	/*
	 * A for loop consists of 3 statements 
	 * 	Starting state 
	 * 	Ending state 
	 * 	incrementation 
	 * 
	 * for(starting state;ending state; incrementing steps)
	 */
	
	public static void main(String[] args) {
		
		int i = 1;
		int c = 0;
		
		for(i = 0; i <= 10; i = i + 2 ) {
			//Where our for loop block logic goes. 
			System.out.println("Hello!");
			
			for(int j = 0 ; j <10; j++) {
				// j++ / j = j+1;
				c++;
				System.out.println(c);
				
				for(int k = -10; k < -1000; k = k -10) {
					if(k < 10000) {
						
					}
				}
			}
		}
		
		System.out.println(i);
	}

}
