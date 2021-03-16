package com.revature;

import com.revature.functional.Motorbike;

public class Honda implements Motorbike {

	@Override
	public boolean wheelie(double fuel, int skillz) {
		if(fuel > 0 && skillz > 9000) {
			System.out.println("I'm popping a wheelie!");
			return true;
		}
		return false;
	}

}
