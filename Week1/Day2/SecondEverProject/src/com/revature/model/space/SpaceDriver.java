package com.revature.model.space;

public class SpaceDriver {

	
	public static void main(String[] args) {
		
		Planet p = new Planet(); //We've declared, initialized and assigned a planet to our p variable
		Moon moon = new Moon("The Moon", 1);
		Moon[] earthMoon = {moon};
		Planet earth = new Planet("Earth", 1, earthMoon,false);

		
		System.out.println(moon.name);
		
		Moon deimos = new Moon ("Deimos", 0.3);
		Moon phoebus = new Moon("Phoebus", 0.5);
		
		Moon[] marsMoons = {deimos, phoebus};
		
		Planet mars = new Planet("Mars", 0.45, marsMoons,false);
		
		System.out.println(earth.mass);
		earth.orbit();
		earth.orbit1();
		earth.crash();
		
		System.out.println(earth.mass);
		
//		Planet p2 = new Planet("Earth",1,Moon,false); //Can't add the mood directly, need to be in array
		Planet p2 = new Planet("Earth",1,earthMoon,false); //Can't add the mood directly, need to be in array

		System.out.println(p2.listAllMoons());
	}
}
