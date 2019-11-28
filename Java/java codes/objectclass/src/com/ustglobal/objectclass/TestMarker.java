package com.ustglobal.objectclass;

public class TestMarker {
	public static void main(String[] args) {
		
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(h);
		System.out.println(s);
		m.mark();
		
		int a = 10;
		Marker p = new Marker();
		System.out.println(p); //p is reference variable
		System.out.println(a); //a is not reference variable
	}
}
