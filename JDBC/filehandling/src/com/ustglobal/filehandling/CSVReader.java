package com.ustglobal.filehandling;

import java.io.*;

public class CSVReader {

	public static void main(String[] args) {

		try(FileReader in =  new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);) {
			while(reader.ready()) {
				String line = reader.readLine();
				//System.out.println(line);
				String[] word = line.split(",");
				System.out.println("Id : "+word[0]);
				System.out.println("Name : "+word[1]);
				System.out.println("Salary : "+word[2]);
				System.out.println("Gender : "+word[3]);
				System.out.println("*********************");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
