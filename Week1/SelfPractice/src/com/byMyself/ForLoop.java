package com.byMyself;

public class ForLoop {

	public static void main(String[] args) {
		
		int i;
		
		for( i = 10; i < 20; i=i + 2) {
			if(i==14) {
				continue; //skips a valid iterations if wanted to.
			}
			System.out.println(i);
	}
		//Strings
//		String[] fruit = {"apple","orange","kiwi","pineapple"};
//		for(String f: fruit) {
//			System.out.println(f);
//		}
	}
}
