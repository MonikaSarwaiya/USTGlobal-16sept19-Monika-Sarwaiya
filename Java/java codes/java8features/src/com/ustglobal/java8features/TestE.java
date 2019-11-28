package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {

	public static void main(String[] args) {

		Supplier<Student> s = () -> new Student(5, "Deepesh", 89.8);
		
		Student s1 = s.get();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);
		System.out.println("Percentage is "+s1.perc);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("Value is "+val);
		
		Supplier<String> str = () -> "Good night";
		String v = str.get();
		System.out.println("Value is "+v);
	}

}
