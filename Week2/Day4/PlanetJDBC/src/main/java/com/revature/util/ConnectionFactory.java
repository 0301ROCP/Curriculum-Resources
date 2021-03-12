package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	/*
	 * JDBC - Java Database Connection
	 * 
	 * JDBC API handles databases using Java, allows us to interact with our
	 * database through CRUD methods
	 * 
	 * Important interfaces in JDBC
	 * 
	 * DriverManager Connection Statement PreparedStatment
	 * 
	 * 
	 */

	/*
	 * What do we need to connect? Username Password Endpoint
	 */

	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "4164";

	// This is our connection object!
	private static Connection conn;

	public static Connection getConnection() {

		try { // there's a fairly high chance, that this will fail!

			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

}
