package com.ustglobal.maps;

import java.util.Hashtable;

public class TestI {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Deepesh");
		ht.put(500, "Afreen");
		ht.put(302, "DK");
		ht.put(400, "Deepu");
		ht.put(990, "Dev");
		ht.put(101, "Virat");
		//ht.put(null, "Dhoni"); NullPointerException
		//ht.put(108, null); NullPointerException

		System.out.println("Data "+ht);
	}

}
