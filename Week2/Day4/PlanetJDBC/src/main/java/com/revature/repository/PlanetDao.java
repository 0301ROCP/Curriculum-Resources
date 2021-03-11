package com.revature.repository;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	/* Design Pattern 
	 * 		General, reusable solution to commonly occuring problems. 
	 * 		A technique to write our code!
	 * 		e.g. Singleton, Factory Design patterns
	 * 
	 * 
	 * DAO: Data Access Object 
	 * 
	 * This is a design pattern to help us abstract away from connection to the database. 
	 */
	
	
	//CREATE
	boolean insertPlanet(Planet p);
	
	
	//READ
	public Planet selectPlanetByName(String name);
	public Planet selectPlanetById(int id);
	public List<Planet> selectAllPlanets();
	
	
	//UPDATE
	//My App allows the planet to change the number of moons it has!
	boolean updatePlanet(Planet oldPlanet, int newNumberOfMoons);
	
	
	//DELETE
	boolean deletePlanet(Planet p);
	
	

}
