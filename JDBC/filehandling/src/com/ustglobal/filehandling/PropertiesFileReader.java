package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {

		String path = "text.properties";
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String name = properties.getProperty("Name");
			String company = properties.getProperty("Company");
			String gf = properties.getProperty("Gf");
			
			System.out.println("Name is "+name);
			System.out.println("Company is "+company);
			System.out.println("Gf is "+gf);


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
