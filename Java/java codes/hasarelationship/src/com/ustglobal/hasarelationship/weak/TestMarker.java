package com.ustglobal.hasarelationship.weak;

public class TestMarker {
	public static void main(String[] args) {

		Person p = new Person();

		System.out.println(p.name);
		System.out.println("-----------------");
		p.sleep();
		System.out.println("-----------------");

		p.eat();
		System.out.println("-----------------");

		p.m.write();//Has-A relation
		System.out.println("-----------------");

	}
}
