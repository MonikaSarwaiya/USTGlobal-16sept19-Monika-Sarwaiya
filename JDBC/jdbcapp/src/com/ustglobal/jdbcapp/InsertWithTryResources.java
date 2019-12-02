package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class InsertWithTryResources {

	public static void main(String[] args) {

		try(FileReader reader = new FileReader("db.properties")){
			
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			String sql = prop.getProperty("insert-query");

			try(Connection con = DriverManager.getConnection(url, prop);
				Statement stmt = con.createStatement()) {
				
				int count = stmt.executeUpdate(sql);
				System.out.println(count + " Row(s) inserted");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
