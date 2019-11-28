package com.ustglobal.hasarelationship.weak;

public class Person {
	
	String name;
	Marker m = new Marker();

	void sleep() {
		System.out.println("Person Sleep Method");
	}
	
	void eat() {
		System.out.println("Person Eat Method");
	}
}
