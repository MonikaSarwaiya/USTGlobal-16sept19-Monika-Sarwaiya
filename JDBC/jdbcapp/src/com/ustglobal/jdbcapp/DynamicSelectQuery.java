package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicSelectQuery {

	public static void main(String[] args) {
	
		Connection con = null;
		PreparedStatement pstmt = null;
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
			
			pstmt = con.prepareStatement(prop.getProperty("select-query1"));
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("Id is "+emp_id);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is "+gender);
				System.out.println("---------------------------");

			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
