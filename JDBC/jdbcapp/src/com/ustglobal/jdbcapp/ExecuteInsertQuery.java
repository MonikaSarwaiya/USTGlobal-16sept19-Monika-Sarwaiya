package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteInsertQuery {

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
			
			
			// Step 3 : Issue SQL Query
			stmt = con.createStatement();
			int count = stmt.executeUpdate(prop.getProperty("insert-query"));
			
			// Step 4 : Read the Result
			System.out.println(count + " Row(s) Inserted");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Step 5 : Close all JDBC Object 
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
