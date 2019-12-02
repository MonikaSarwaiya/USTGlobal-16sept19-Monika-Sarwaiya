package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteUpdateQuery {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		FileReader reader = null;
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			// Step 1 : Load the Driver
			Class.forName(prop.getProperty("driver-class-name"));
			
			// Step 2 : Get the connection
			String url = prop.getProperty("url");
			con = DriverManager.getConnection(url, prop);
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(prop.getProperty("update-query"));
			System.out.println(count + " Row(s) updated");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
