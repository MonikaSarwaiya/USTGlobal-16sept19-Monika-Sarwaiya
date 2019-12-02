package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteInsertQuery1 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
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
			String sql = "";
			pstmt = con.prepareStatement(prop.getProperty("insert-query1"));
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
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
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
