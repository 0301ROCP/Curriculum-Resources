
//This is a single line comment, I'll be using this to add additional information to the code!
//The JVM ignores this, invalid piece of code 

/*
 * This is a multi-line comment 
 * 
 * If I try to write this out without comments, the JVM will not be happy!
 */

public class HelloWorld { //This is a class called "HelloWorld" 
	//Java Syntax: Classes are written with Title case, so rather than "Hello World" or "hello-world", we 
	// write it as "HelloWorld"
	

	//JVM needs an entry point to start! Otherwise it sees code, and not sure where to start running!
	//Via the main method: 
	
		public static void main(String[] args) {
			//Java will execute any code inside here!
			
			System.out.println("Hello World!");
		}
}
