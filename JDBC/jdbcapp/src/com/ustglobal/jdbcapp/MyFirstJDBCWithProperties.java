package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
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
			String sql = prop.getProperty("select-query");
			rs = stmt.executeQuery(sql);
			
			// Step 4 : Read the Result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+sal);
				System.out.println("Gender : "+gender);
				System.out.println("******************");

			}
		} catch(SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			// Step 5 : CLose all JDBC Objects
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch(SQLException | IOException e){
				e.printStackTrace();
			}
		}
	}

	}


