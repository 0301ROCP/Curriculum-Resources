package com.revature.service;

import com.revature.models.Moon;
import com.revature.models.Planet;
import com.revature.repository.MoonDao;
import com.revature.repository.PlanetDao;

public class PlanetManipulationOptionsImpl implements PlanetManipulationOptions{
	
	PlanetDao pDao;
	MoonDao mDao;

	@Override
	public void destroyPlanet(Planet p) {
		
		System.out.println("Destroying planet: " + p.getName());
	
		pDao.deletePlanet(p);
		
	}
	
	public void crashPlanetAndMoon(Planet p, Moon m) {
		
		pDao.deletePlanet(p);
		mDao.deleteMoon(m);
		
	}

	
	
}
