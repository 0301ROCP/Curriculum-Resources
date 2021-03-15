package com.revature.exceptions;

public class PressedWrongButton extends RuntimeException{

		@Override
		public void printStackTrace() {
			super.printStackTrace();
			System.out.println("You pressed the wrong button!!!!");
		}
}
