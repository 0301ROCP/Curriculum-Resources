package com.revature.maths;

import com.revature.exceptions.PressedWrongButton;

public class Calculator {
	
	public boolean magic;
	
	public Calculator() {
		super();
		this.magic = false;
	}

	public int add(int x, int y) {
		return x+y;
	}
	
	public double add(double... x) {
		double sum = 0;
		
		for(double i: x) {
			sum += i;
		}
		return sum;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public boolean isEven(int x) {
		
//		if(x%2 == 0) {
//			return true;
//		}else {
//			return false;
//		}
		
		boolean isEven;
		
		if(x%2 == 0) {
			isEven = true;
		}else {
			isEven = false;
		}
		
		return isEven;
		
//		return (x%2 == 0);
		
	}

	public void toggleMagic() {
		this.magic = !this.magic;
//		this.magic = true;
	}
	
	public void pressingButtons() { //all this method does, is throw an exceptions 
		
		throw new PressedWrongButton();
	}
}
