package com.ustglobal.singleton;

public class MySingleton {

	private static MySingleton instance = null;
	String s;

	private MySingleton() {

	}

	public static MySingleton getDBConnection() {

		if(instance == null) {

			instance = new MySingleton();
			return instance;

		} else {
			return instance;
		}
	}
}
