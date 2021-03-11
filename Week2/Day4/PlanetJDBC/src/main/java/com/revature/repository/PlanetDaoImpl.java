package com.revature.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class PlanetDaoImpl implements PlanetDao{

	@Override
	public boolean insertPlanet(Planet p) {
		
		Connection conn = ConnectionFactory.getConnection();
		boolean successfulSQL;
		
		//I'll be showing 2 ways to send queries to SQL 
		// The bad way, first time round, then the good way !
		
		//The TERRIBLE way 
		String sql = "INSERT into planets (planet_name, planet_Description, has_rings, number_of_moons) values"
					+ "('" + p.getName() + "','" + p.getDescription() + "','" + p.isHasRings() + "'," 
					+ p.getNumberOfMoons() + ");";
		
		
		try {
			
			//We want to pass the STring into a SQL statement 
			 Statement s = conn.createStatement();
			
			//Execute said query 
			s.execute(sql);
			
			//change that to true because query executed 
			successfulSQL = true;
			
			//close our connection, once we're done with it!
			conn.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			successfulSQL = false;
		} 
		
		return successfulSQL;
	}

	@Override
	public Planet selectPlanetByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Planet selectPlanetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planet> selectAllPlanets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePlanet(Planet oldPlanet, int newNumberOfMoons) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanet(Planet p) {
		// TODO Auto-generated method stub
		return false;
	}

}
