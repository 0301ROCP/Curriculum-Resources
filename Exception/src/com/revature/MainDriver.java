package com.revature;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.revature.models.Car;

public class MainDriver {

	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Exceptions:
		 * 
		 * 		Is a problem that occurs during the execution of a program
		 * 		
		 * 		Occurs during the normal flow of the program, causing disruptions
		 * 
		 * 		Exceptions are good!  They give us feedback for poorly written code.
		 * 
		 * 
		 */
		
//		int a = 1/10; //Arithmetic exception (runtime exception
		
//		Car c = new Car("Mclaren", 12); //does not compile / this is an error
		
//		Car c1 = (Car) new Object(); //
		
//		Car c = new Car();
//		c.invalidMethod();
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give me a # to divide 22 with");
		
		try {
			int a = sc.nextInt();
			System.out.println(22/a);
		} catch(Exception e) {
			
			e.printStackTrace(); //this is a debugging tool!
			
			System.out.println("You messed up!!!");
		} catch(ArithmeticException e) {
			
			System.out.println("Don't use 0");
			
		} catch(InputMismatchException e) {
			
			System.out.println("Use a valid number");
			
		} catch(RuntimeException e) {
			
			System.out.println("not sure what happened, but there is an exception");
			
		} catch(Exception e) {
			
			System.out.println("not sure what happened");
			
		} catch(Error e) {
			System.out.println("caught an error");
			
		} 
		
		
		
		
		
		
	}
	
}
