package com.revature.repository;

import java.util.List;

import com.revature.models.Moon;

public class MoonDaoHardCoded implements MoonDao {
	
	private static List<Moon> listOfMoons;

	@Override
	public boolean insertMoon(Moon m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean selectMoonById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlanetRelationship(String newPlanet, int moonId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMoon(Moon m) {
		// TODO Auto-generated method stub
		return false;
	}

}
