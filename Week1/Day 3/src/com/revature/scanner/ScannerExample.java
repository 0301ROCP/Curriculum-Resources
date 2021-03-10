package com.revature.scanner;

import java.util.Scanner; //We are importing from the java/utilities, specifically Scanner class

import com.revature.strings.Potato;

//import java.util.*;//This will import everything from the util package!

public class ScannerExample {
	
	public static void main(String[] args) {
		
		
		/*
		 * The Scanner class allows us to communicate through the console
		 * 
		 */
		
		Potato p = new Potato();
		Scanner sc = new Scanner(System.in); //Scanner does not have a no-args constructor.
											//System.in tells the scanner to accept inputs from the terminal
		
		boolean menuIsActive = true;
		
		
		while(menuIsActive) {
			System.out.println("Hello there!");
			System.out.println("Write down a number!");
			
			String a = sc.nextLine(); //only use this preferably
			
			int number = Integer.parseInt(a); //This is a class

			
			if(number > 100) {
				System.out.println("You're number is greater than 100");
			}
			
			System.out.println("This is your number! " + number);
			
			System.out.println("Do you want to exit now?");
			String b = sc.nextLine();
			
			if(b.equals("yes")) {
//			menuIsActive=false;
			break;
			}
			
			System.out.println("Give feedback please!");
		}
		
	}

}
