package com.revature;

import com.revature.models.Planet;
import com.revature.repository.PlanetDao;
import com.revature.repository.PlanetDaoImpl;
import com.revature.util.ConnectionFactory;

public class MainDriver {
	
	public static void main(String[] args) {
		
		
		ConnectionFactory.getConnection();
		
		PlanetDao pDao = new PlanetDaoImpl();
		
		Planet p = new Planet(0, "Planet-X", "Fake planet 2.0", true, 100);
		
		pDao.insertPlanet(p);
		
	}

}
