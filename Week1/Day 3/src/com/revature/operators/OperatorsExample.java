package com.revature.operators;

public class OperatorsExample {
	
	public static void main(String[] args) {
		

	/*
	 * Operators in Java
	 */
		
		double i = 10;
		double j = 7;
		
		//arithmetic Operators
		// (x,y)
		
		int k = (int) (i+j); //addition
		int l = (int) (i-j); //subtraction
		int o = (int) (i*j); //multiplication
		double q = i/j; //division, it will be accurate as the primitive data will allow.
						// in this case we need at least one double datatype to get a somewhat accurate result!
		
		
		double c = i%j; //Modulus, returns the remainder of a division
		
		//(increment) arithmetic operators
		//(x)
		i++;// i = i+1;
		j--; //j=j-1;
		
		++i;
		++j;
		
		if(i++ > 12) { //when this expression is evaluated, it's also added by 1
			/*
			 * When we use i++, the boolean expression is evaluated first, then the '++' operator is applied.
			 * i++ > 12 : is i greater than 12? add 1 to i
			 * ++i > 12 : add 1 to i and then is i greater than 12?
			 */
			
			System.out.println(i);
		}
		
		System.out.println(i);
		
		//Assignment operators 
		//(x,y)
		
		int u = k; //Assigning a variable to be equal to the value of the right value.
		u += k; //u=u+k;
		u -=k; //u=u-k;
		u *= k; //u=u*k;
		u /=k; //u=u/k;
		u %=k; //returns the remainder of the original value divided by the right value, u = u%k;
		
		
		//Comparison Operators
		//(x,y) evaluate to a boolean
		
		boolean isTrue = (i == k); //
		isTrue = (i>k);
		isTrue = (i<k);
		isTrue = (i != k); //left value is not equal to right value
		isTrue = (i >= k); //greater than or equal
		isTrue = (i <= k); //less than or equal
		
		int g = 10 - (3 * 2) + 1; //5
		g = (10 - 3) * (2 + 1); //21
		g = (10) - (3 * 2) + (1); //5
		
		
		//Java Logical Operators!
		
		boolean numberCheck = i == 13 && j == 7 && g==5;
		
		if( i == 13 && j == 7 && g == 5) {
			
			//all the expressions have to evaluate to true.
			
		}else if ( i == 13 || j == 7  || g == 5) {
			
			//any of the expressions have to evaluate to true. ( we just need one number to match)
			
		} else if (!( i == 13 && j == 7 && g == 5)) {
			
			//None of the expressions van evaluate to true
			
		}else if ( i > 13 && (j == 7  || g == 5)) {
			
			// i HAS to be greater than 12 and j can equal 7 or g can equal 5
			
		} else if (( i > 13 && j == 7)  || g == 5) {
			
			// i HAS to be greater than 7 and j HAS to be equal to 7, optionally we can have g be equal to 5.
			
		}
		
		
		boolean t = i == 7 & j == 8; // if the left hand side is false, the right hand is still evaluated! 
		
		
		//Main Java logical operators
		
		t = i++ == 7 && j++ == 8; // if the left hand side is false, then the right hand isn't evaluated!
		
		//Both & and && will evaluate to false or true, depending on the values.
		
		
		//If i had a human object with a name
		/*
		 * Human steve = new Human ("Steve")
		 * 
		 * steve = null;
		 * 
		 * if(steve.name == "Steve") {--> will throw an exception
		 * 
		 * if (steve != null && steve.name == "Steve") {--> won't throw an exception
		 * 		if steve is null, the right hand side of the expression won't be evaluated
		 * 
		 * if(steve != null & steve.name == "Steve"){--> will throw an exception
		 */
		
		
	}
}
