package com.ustglobal.hasarelationship.weak;

public class Car {
	
	String name;
	
	Music m = new Music();

	void start() {
		System.out.println("Car Start Method");
	}
	
	void stop() {
		System.out.println("Car Stop Method");
	}
}
