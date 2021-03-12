package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		
		//The TERRIBLE way - Using Statement interface 
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
	public boolean insertPlanetWithPreparedStatement(Planet p) {
//		Connection conn = ConnectionFactory.getConnection();
		boolean successfulSQL;
		
		String sql = "INSERT into planets (planet_name, planet_description, has_rings, number_of_moons) values "
				+ "(?,?,?,?)";
		/*
		 * With PS we don't need to worry about SQL INJECTION 
		 * 
		 * What is SQL Injection?
		 * 	
		 * 	example: 
		 * 		students name is "timmy; drop table;" 
		 * 		student name is "johhy doubel: truncate table";
		 * 
		 * 		select * from students where student_name = timmy; drop table; -- will drop the table
		 * 
		 * 		select * from students where student_name = 'timmy; drop table'; -- this will select a user called "timmy; drop tables"
		 * 
		 * 
		 * With prepared statements, we stop it from being attacked with sql injection 
		 */
		
//		try(Object i = 1){ // need the object to have a .close() method 
//			//the resource type Object does not implement java.lang.AutoCloseable
//			
//		}catch (Exception e) {
//			
//		}
		
		try (Connection conn = ConnectionFactory.getConnection()){ //Try with resources block 
			// Once the try-catch block has finished, the resource will be closed 
			//only be used with objects that have the .close();
//			Connection conn = ConnectionFactory.getConnection()
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setString(2, p.getDescription());
			ps.setBoolean(3, p.isHasRings());
			ps.setInt(4, p.getNumberOfMoons());
			
			ps.execute();
			conn.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public Planet selectPlanetByName(String name) {

		List<Planet> planets = new ArrayList<>(); //I might not have a unique name constraint! 
		//Be prepared for multiple entities 
		
		//Willl close the connection once we're out of the try catch block!
		try(Connection conn = ConnectionFactory.getConnection()){
			
			//We're still levaraging prepared statement
			String sql = "SELECT * FROM planets WHERE planet_name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			//We expect infromation back, unlinke in the insert statemetn 
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) { //passing in inforamtion from the result set into the Planet constructor!
				planets.add(new Planet(
						rs.getInt("planet_id"),
						rs.getString("planet_name"),
						rs.getString(3),
						rs.getBoolean("has_rings"),
						rs.getInt(5)
						));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return planets.get(0); //return the first element
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
