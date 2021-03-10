package com.revature.scanner;

import java.util.Scanner; //we are importing from the java/utilities, specifically Scanner class

import com.revature.scopes.Potatoe; //fully qualified name



//import java.util.*; //This will import everything from the util package!

public class ScannerExample {
	
	Scanner sc;
	
	public static void main(String[] args) {
		
		
		/*
		 * The scanner class allows us to communicate through the console
		 */
		
		Potatoe p = new Potatoe();
		Scanner sc = new Scanner(System.in); //Scanner does not have a no-args constructor. 
											//System.in tells the scanner to accept inputs from the terminal 
		boolean menuIsActive = true;
		
		
		
		while(menuIsActive) {
			
			System.out.println("Hello there!");
			System.out.println("Write down a number!");
			
			
			String stringNumber = sc.nextLine(); //only use this prefereabbly 
			
			int number = Integer.parseInt(stringNumber);
			
			if(number > 100) {
				System.out.println("You're number is greater than 100");
			}
			
			System.out.println("This is your number! " + number);
			
			System.out.println("Do you want to exit now?");
			
			String exitStatus = sc.nextLine();
			
			if(exitStatus.equals("yes")) {
//				menuIsActive = false;
				break;
			}
			
			System.out.println("Give feedback please!");
			
		}
		
		
		
		
	}

}
