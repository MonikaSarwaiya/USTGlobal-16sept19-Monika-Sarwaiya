package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// Step 1 : Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// Step 2 : Get the connection
			String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root" ;
			con = DriverManager.getConnection(url);
			
			// Step 3 : Issue SQL Query
			stmt = con.createStatement();
			String sql = "Select * from employee_info";
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
		} catch(SQLException e) {
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
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
