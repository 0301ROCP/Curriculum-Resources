package com.revature.operators;

public class OperatorsExamples {
	
	public static void main(String[] args) {
		
		
		/*
		 * Operators in Java
		 */
		
		double i = 10;
		int j = 7;
		
		//Arithmitic Operators 
		// (x,y)
		
		int k = (int) (i + j); //addition
		int l = (int) (i - j); //subtraction
		int o = (int) (i*j); //multiplication 
		double q = i/j; //division, it will be as accurate as the primitive data will allow. 
						// in this case we need at least one double datatype to get a somewhat accurate result!
		
		
		double c = j%2; //Modulus, returns the remainder of a division 
		
		//(Increment) Arithmitic operators
		//(x)
		i++; // i = i +1;
		j--; // j = j -1;
		
		
		++i;
		++j;
		
		if( ++i > 10) { //When this expression is evaluated, it's also added by 1
			/*
			 * When we use i++, the boolean expression is evaluated first, then the '++' operator is applied. 
			 * 		i++ > 12 : is i greater than 12 ? add 1 to i 
			 * 		++i > 12 : add 1 to i and then is i greater than 12? 
			 * 			
			 */
			System.out.println(i);
		}
			
		
		System.out.println(i);
		
		//Assignment Operators 
		//(x,y)
		
		int u = k; //Assigning a variable to be equal to the value of the right value
		u += k; // u = u + k;
		u -= k; // u = u - k;
		u *= k; // u = u*k;
		u /=k;  // u = u/k;
		u %=k; //returns the remainder of the original value divided by the right value, u = u%k;
		
		
		//Comparison Operators
		// (x,y) evaluate to a boolean 
		
		boolean isTrue = (i == k);
		isTrue = (i > k); //greater
		isTrue = (i < k); //less than
		isTrue = (i != k); //left value is not equal to right value  
		isTrue = (i >= k); //greater than or equal 
		isTrue = (i <= k); // less than or equal 
		
		int g = 10 - (3 * 2) + 1; // 5
		g = (10 - 3) * (2 + 1); //21
		g = (10) - (3 * 2) + (1); //5
		
		
		//Java Logical Operators!
		
		boolean numberCheck = i == 13 && j == 7 && g == 5;
		
		if(i == 13 && j == 7 && g == 5) {
			
			// All the expression have to evaluate to true (all numbers must match)
			
		}else if( i == 13 || j == 7 || g == 5) {
			
			//any of the expressions have to evaluate to true ( we just one number to match)
			
		}else if ( !(i == 13 && j == 7 && g == 5)) {
			
			// None of the expression can evaluate to true 
			
		}else if( i > 13 && (j == 7 || g == 5)) {
		
			// i HAS to be greater than 13 and j can equal 7 or g can equal 5
			
		}else if( (i > 13 && j == 7) || g == 5) {
			
			// i HAS to be greater than 13 and j HAS to be equal to 7, optionally we can have g be equal to 5 
			
			}
		
		
		boolean t = i++==7 & j++==8; //if the lefthand side is false, the righthand side is still evlauted!
		t = i++==7 | j++==8; //if the lefthand side is true, then the righthand side does  evaluate!
		
		//MAIN JAVA LOGICAL OPERATORS!
		
		t = i++==7 && j++==8; //if the lefthand side is fale, then the right hand isn't evaluated!
		
		t = i++==7 || j++==8; //if the lefthand side is true, then the righthand side does not evaluate!
	
		t = !t; // This will flip the boolean value every time. 
		
		//Both & and && will evaluate to false or true, depending on the values. 
		
		
		//If I had a human object with a name 
		/*
		 * Human steve = new Human("Steve");
		 * 
		 * steve = null;
		 * 
		 * if( steve.name == "Steve"){ --> Will throw an exception 
		 * 
		 * if(steve != null && steve.name == "Steve"){ -> won't throw an exception 
		 * 			//if steve is null, the right hand side of the expression won't be evaluated 
		 * 
		 * if(steve != null & steve.name == "Steve"){ --> will thrown an exception!
		 * 		
		 */
		
		
		
	}

}
