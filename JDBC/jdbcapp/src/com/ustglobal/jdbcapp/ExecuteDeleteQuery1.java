package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteDeleteQuery1 {

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
			
			pstmt = con.prepareStatement(prop.getProperty("delete-query1"));
			
			int id = Integer.parseInt(args[0]);
			pstmt.setInt(1, id); // pstmt.setInt(1, Integer.parseInt(args[0]);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " Row(s) deleted");
			
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
