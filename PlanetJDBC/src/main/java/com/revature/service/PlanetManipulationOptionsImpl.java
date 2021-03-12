package com.revature.service;

import com.revature.models.Planet;
import com.revature.repository.PlanetDao;

public class PlanetManipulationOptionsImpl implements PlanetManipulationOptions{
	
	PlanetDao pDao;

	public void destroyPlanet(Planet p) {
		
		System.out.println("Destroying planet: " + p.getName());
	
		pDao.deletePlanet(p);
		
	}

	
	
}
