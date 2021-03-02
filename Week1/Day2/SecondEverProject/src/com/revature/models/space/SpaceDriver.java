package com.revature.models.space;

public class SpaceDriver {
	
	public static void main(String[] args) {
		
		Planet p = new Planet(); // We've declared, initialized and assigned a planet toour p variable.
		
		Moon moon = new Moon("The Moon", 1);
		Moon[] earthMoons = {moon};
		
//		System.out.println(moon.name);
		
//		Planet p2 = new Planet("Earth", 1, moon, false); Can't add the moon directly, need to be in an array
		Planet earth = new Planet("Earth", 1, earthMoons, false);
		
		
		Moon deimos = new Moon("Deimos", 0.3);
		Moon phoebus = new Moon("Phoebus", 0.5);
		
		Moon[] marsMoons = {deimos, phoebus};
		
		Planet mars = new Planet("Mars", 0.45,marsMoons,false);
		Planet fakeMars = mars;
		
		System.out.println("Earth mass :" + earth.mass);
		System.out.println("Mars mass :" + mars.mass);
		earth.orbit();
		earth.crash(earth);
		
		System.out.println("Mars mass :" + mars.mass);
		System.out.println("Earth mass :" + earth.mass);
		

	
		
	}

}
