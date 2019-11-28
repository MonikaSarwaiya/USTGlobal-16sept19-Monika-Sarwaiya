package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
		//System.out.println(p.size);
		//p.color();
		Marker m = (Marker) p; //Downcasting
		System.out.println(m.size);
		m.color();
		m.write();
	}
}
