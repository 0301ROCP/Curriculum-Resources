package com.revature.models;

public class ModelDriver {
	
	public static void main(String[] args) {
		
		
		Object o = new Object();
		
		MenuItems m = new MenuItems("Apple",100);
		MenuItems m1 = new MenuItems("Tea",100);
		MenuItems m2 = new MenuItems("Biscuit",100);
		MenuItems m3 = new MenuItems("Chocolate Biscuit",100);
		
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		Planet p = new Planet("Pluto", 1, false);
		System.out.println(p);
		
		o.equals(o);
		o.toString();
		
		Object apples = new MenuItems();
	}

}
