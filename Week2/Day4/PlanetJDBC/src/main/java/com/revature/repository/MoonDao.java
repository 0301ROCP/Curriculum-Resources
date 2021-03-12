package com.revature.repository;

import com.revature.models.Moon;

public interface MoonDao {
	
	//CREATE
	boolean insertMoon(Moon m);
	
	//READ
	boolean selectMoonById(int id);
	
	//UPDATE 
	boolean updatePlanetRelationship(String newPlanet, int moonId);
	
	//DELETE
	boolean deleteMoon(Moon m);
	

}
