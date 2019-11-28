package com.ustglobal.springcore.di;

public class Dog implements Animal {

	public Dog() {

		System.out.println("Dog object is created");
	}
	
	@Override
	public void makeSound() {

		System.out.println("Baooooooooooooooooo");
	}

	
}
