package com.revature.control;

public class WhileExample {
	
	public static void main(String[] args) {
		
		/*
		 * A while loop only needs one condition:
		 * 		a boolean statement (end condition)
		 */
		
		int firstVariable = 1000;
		
		while(firstVariable < 1000) {
			
//			firstVariable++;
			firstVariable = 1000;
			
			System.out.println("inside while!");
		}
		
		while(true) {
			//No way to contradict this boolean statement 
			
			break; //exit out of the looping block , and any code after it (inside of the loop) will not complete!
//			
//			while(true) {
//				break;
//			}
//			
//			
		}
		
		boolean looping = true;
		
		while(looping) {
			
			
			if(looping) {
				continue; //What does this word do? 
			}
			looping = false;
			
			System.out.println("Hello!");
			
		}
		
		do { //Will execute at least once, even if the condition has not been met!
			System.out.println("Inside do while!");
			firstVariable++;
		}while(firstVariable < 1000);
		
		System.out.println(firstVariable);
		
		
		
		
	}

}
