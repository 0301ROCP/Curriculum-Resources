package com.revature.models;

public class User {
	
	private String username;
	private int membershipLevel;
	private TennisRacket myRacket;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, int membershipLevel) {
		super();
		this.username = username;
		this.membershipLevel = membershipLevel;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMembershipLevel() {
		return membershipLevel;
	}
	public void setMembershipLevel(int membershipLevel) {
		this.membershipLevel = membershipLevel;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", membershipLevel=" + membershipLevel + "]";
	}
	
	
	

}
