package com.revature.control;

public class IfExample {
	
	public static void main(String[] args) {
		
		/*
		 * if block allows us to conditionally execute logic.
		 */
		
		
//		System.out.println("I want this only printed if a number is even!");
		

		int numberCondition = 100;
		
		//Basic if statement
		//if(condition)
		
//		if(numberCondition>-10) {
//			System.out.println("The number is greater than -10!");
//		}
//		
//		if(numberCondition<10) {
//			System.out.println("The number is less than 10!");
//		}
		
		// if  and else if
		
		if(numberCondition == -10) {
			
			//Code will execute if condition has been met
			
			System.out.println("The number is greater than -10!");
		
			
			
			/*
			 * This block of code is useless!
			 */
			
		} else if(numberCondition<10) {
			//Code will execute if condition has been met and prior conditions have been not met!
			System.out.println("The number is less than 10!");
			
		} else if(numberCondition<1) {
			
			System.out.println("The number is less than 1");
			
		}
		
		
		//if and else if and else 
		
		if(numberCondition == -10) {
			
			System.out.println("The number is greater than -10!");
			
		} else if(numberCondition<10) {
			
			System.out.println("The number is less than 10!");
			
		} else if(numberCondition<1) {
			
			System.out.println("The number is less than 1");
			
		} else {
			
			//Will execute, only if no other conditions have been met!
			//So in this case, I pick a number thats greater than 10 and 1 and not equal to -10
			System.out.println("None of the conditions have been met!");
			
		}
		
		
		//I want to check that the number is between 10 and -10
		
		int myNumb = 7;
		
		if(myNumb < 10) {
			System.out.println(myNumb);
			
			if(myNumb > -10) {
				System.out.println("The number is between 10 and -10");
			}
		}
		
		
		if(myNumb < 10 && myNumb > -10) {
			//This will execute if number is between 10 and -10
//			"AND"
		}
		
		if(myNumb < 10 || myNumb > -10 ) {
//			This will execute if either conditions have been met!
		}
		
		
		
		
	}

}
