package com.ustglobal.objectclass;

public class CowTest {
	
	public static void main(String[] args) {
		
		Cow c = new Cow(1, "Ganga", 10000);
		
		Cow c1 = new Cow(2, "Gouri", 20000);

		Cow c2 = new Cow(1, "Ganga", 10000);
		
		Cow c3 = c2;
		
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c2));
		System.out.println(c3.equals(c2));
		
		int h = c.hashCode();
		int h1 = c1.hashCode();
		int h2 = c2.hashCode();
		int h3 = c3.hashCode();
		
		System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

	}

}
