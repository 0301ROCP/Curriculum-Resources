package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.revature.models.Planet;

public class MainDriver {
	
	public static void main(String[] args) {
		
		List<Planet> planetList = new LinkedList<>();
		
		planetList.add(new Planet("Earth", "Blue", 1, false));
		planetList.add(new Planet("Mars", "Red", 0.6, false));
		planetList.add(new Planet("Mercury", "Brown", 0.2, false));
		planetList.add(new Planet("Jupiter", "Brown", 60, true));
		planetList.add(new Planet("Saturn", "Yellow", 40, true));
		
		
		List<Planet> planetListWithoutRings = new ArrayList<Planet>();
		
		
		
		for(Planet p: planetList) {
			if(!p.isRings()) {
				planetListWithoutRings.add(p);
			}
			
		}
		
		
		
		
		planetListWithoutRings = planetList
				.stream() //A method that all collection entities have, it will return a Stream<T>
				.filter(p -> !p.isRings()) //filter method returns boolean, in this case based on the ring status
				.collect(Collectors.toList()); // Finally translates the Stream entity into a Collection entity
		
		
		//Creating a set of planets with mass less than 2 
		Set<Planet> planetsLessThanTwo = new HashSet<>();
		
		planetsLessThanTwo = planetList
				.stream()
				.filter((myPlanet) -> myPlanet.getMass() < 2)
				.collect(Collectors.toSet());
		

		//print out brown planets, that have rings!
	
		
		planetList.stream()
			.filter(planet -> planet.getColour().equals("Brown"))
			.filter(p -> p.isRings())
			.forEach(myBrownAndRingedPlanet -> System.out.println(myBrownAndRingedPlanet.getName()));
		
		//I want to double the mass of each of the planets!!!
		
		planetList = planetList.stream()
				.map(p -> new Planet(p.getName(),p.getColour(),p.getMass()*2,p.isRings()))
				.collect(Collectors.toList());
		
		System.out.println(planetList);
		
		
//		System.out.println(planetListWithoutRings);
		
		
		/*
		 * Stream API (Introduced in Java8 )
		 * 
		 * Allows us to manipulate a collection of objects (Any Collection entity or Array)
		 * 
		 * 		- STREAM IS NOT A DATA STRUCUTRE
		 * 		- IT DOES NOT MODIFY THE ORGIGNAL DATA STRUCTURE
		 * 		- It consists of INTERMEDIATE OPERATIONS and TERMINAL OPERATIONS
		 * 
		 * 		With the Stream API, we get a more delarative way of expressing our code. 
		 * 		Easier to understand what's going on! 
		 * 
		 * 		Downsides?
		 * 			Performance is better with a For loop.
		 * 			Unfamiliar with stream. 
		 * 			debuggers 
		 * 
		 * Intermediate operations: 
		 * 
		 * 		map: changes the elements to a new/modified element, of the same data type!!!
		 * 		filter: filters the list based on a condition
		 * 		sorted:
		 * 
		 * Terminal Operations:
		 * 	
		 * 		collect: allows us to return a Collection entity (using the Collectors class static method)
		 * 		forEach: allows us to iterate through every element of the stream !!!
		 * 		reduce: 
		 * 
		 * 
		 */
		
	
		
	}

}
