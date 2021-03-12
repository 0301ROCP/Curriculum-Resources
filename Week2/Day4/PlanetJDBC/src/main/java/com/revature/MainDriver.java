package com.revature;

import com.revature.models.Planet;
import com.revature.repository.PlanetDao;
import com.revature.repository.PlanetDaoImpl;
import com.revature.util.ConnectionFactory;

public class MainDriver {

	public static void main(String[] args) {

		ConnectionFactory.getConnection();

		PlanetDao pDao = new PlanetDaoImpl();

		// Planet p = new Planet(0, "Brand New Planet", "Fake planet 4.0", true, 100);
		// pDao.insertPlanetWithPreparedStatement(p);

		System.out.println();

		Planet returnedPlanet = pDao.selectPlanetByName("Brand New Planet");
		System.out.println(returnedPlanet);

		System.out.println();

		Planet returnedId = pDao.selectPlanetById(1);
		System.out.println(returnedId);

		System.out.println();

		pDao.selectAllPlanets();

		System.out.println();

	}

}
