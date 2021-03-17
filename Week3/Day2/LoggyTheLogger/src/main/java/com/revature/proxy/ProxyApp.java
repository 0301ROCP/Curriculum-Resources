package com.revature.proxy;

import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ProxyApp {
	
	//Is a placeholder for an entire project. 
	// i.e. all the layers: repo, sercie, presentation, utility, models
	
	final static Logger loggy = Logger.getLogger(ProxyApp.class);
	
	public static void presentationLogic() {
		loggy.info("I'm doing some presentation stuff");
	}
	
	public static void serviceLogic() {
		loggy.info("Some service logic");
	}
	
	
	public static void main(String[] args) {
		
		loggy.setLevel(Level.INFO);
		
		loggy.info("Hello there!");
		
		presentationLogic();
		
		serviceLogic();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me your favorite number!");
		
//		loggy.setLevel(Level.ERROR);
		
		try {
			int numb = sc.nextInt();
			loggy.info("user put in valid number!");
		} catch (Exception e) {
			System.out.println("You need to put a number in!");
			loggy.error("The user has put in an invalid value");
		}
		
	}

}
