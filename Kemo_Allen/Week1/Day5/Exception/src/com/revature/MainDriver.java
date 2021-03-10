package com.revature;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.cafe.BenCafe;

public class MainDriver {
	
	public static void alsoAnotherInvalidMethod() throws Exception{ //throws means that I expect this to throw an Exception
			int i =1;
	}
	
	public static void anotherInvalidMethod() throws RuntimeException{
//		throw new RuntimeException();
	}
	
	public static void riskyMethod() throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			
		try {
			
			System.out.println("Give me a number to divide 22 with.");
			String a1 = sc.nextLine();
			
			int a = Integer.parseInt(a1);
			
			System.out.println(22/a);
			
			break;
			
		} catch(ArithmeticException e) {
			
			System.out.println("Don't put in 0!");
			
		} catch(InputMismatchException e) {
			
			System.out.println("PPut in valid number!");
			
		} catch(RuntimeException e) {
			
			System.out.println("I don't know happened, but there's been exception!");
		} catch(Exception e) {
			
			System.out.println("I have no idea what hpapened!");
			
		} catch(Error e) {
			
			
			/*
			 * You can't really do anythign about it! Someone hitting your PC with a hammer!
			 *  Running out of system memory!
			 *  
			 *  Bad practice to  catch errors!
			 */
		} catch(Throwable t) {
			
			/*
			 * Throwable may be an exception , but it cal also be an error. In which case, not a good idea!
			 */
		}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * Exceptions:
		 * 
		 * 		Is a problem that occurs during the excecution of a program. 
		 * 
		 * 		Occurs during the normal flow of the program, causing disruptions. 
		 * 
		 * 		Exceptions are good! They give us feedback for poorly written code. 
		 * 
		 */
		
		
//		int a = 1/0;  //Arithmitic Exception (Runtime Exception) 
		
//		Car c = new Car("Mclaren"); asldkfjalskjdnlkasndflkas; //Does not even compile! this is an ERROR!
		
//		Car c1 = (Car) new Object(); //ClassCastExceptions --> runtime exception!
		
//		Car c = new Car();
//		c.invalidMethod();

		/*
		 * The way to handle excpetions : 
		 * 
		 * 		try -catch block!
		 * 
		 * try{
		 * 		This is where your risky code goes!
		 * 	} catch (Exception e){
		 * 		rectified code!
		 * }
		 * 
		 * throw: throws an exception in the code
		 * 
		 * throws: a way of passing responsibility!
		 * 		 Tells anything that is calling the method, that is is calling a risky method!
		 */
		
		
		
		
		
		try {
			anotherInvalidMethod(); //Runtime Exceptions don't have to be handled all the time, it's just best practice. 
			
			alsoAnotherInvalidMethod(); //Exceptions, they are forced to be handled, even if you think it's unlikley to happen 
			
			//Input Output classes/methods have a high chance of failing. 
			// IOException as a checked exception!
		} catch(RuntimeException e) {
			
		} catch(Exception e) {
			System.out.println("This is how you handle an exception!");
		}
		
		
		BenCafe bc = new BenCafe();
		bc.riskyMethod();
		
		
		
		
		
		
	}

}
