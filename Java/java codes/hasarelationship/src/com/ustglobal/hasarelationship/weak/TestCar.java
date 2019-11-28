package com.ustglobal.hasarelationship.weak;

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println("--------------");

		c.start();
		System.out.println("--------------");
		
		c.stop();
		System.out.println("--------------");
		
		c.m.playMusic();

	}
}
