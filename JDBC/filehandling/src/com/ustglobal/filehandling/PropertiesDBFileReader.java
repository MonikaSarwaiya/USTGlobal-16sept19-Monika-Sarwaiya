package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesDBFileReader {

	public static void main(String[] args) {

		String path = "db.properties";
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			Properties prop = new Properties();
			prop.load(reader);
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
			System.out.println("URL is "+url);
			System.out.println("User is "+user);
			System.out.println("Password is "+password);


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
