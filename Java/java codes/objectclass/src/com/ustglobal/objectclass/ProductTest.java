package com.ustglobal.objectclass;

public class ProductTest {

	public static void main(String[] args) {

		Product p = new Product(1, "Pen", "Write", 100, "Cello");

		Product p1 = new Product(2, "Pencil", "Write", 200, "Dome");

		Product p2 = new Product(3, "Pen", "Write", 100, "Cello");

		Product p3 = p2;

		System.out.println(p.equals(p1));
		System.out.println(p.equals(p2));
		System.out.println(p3.equals(p2));

		int h = p.hashCode();
		int h1 = p1.hashCode();
		int h2 = p2.hashCode();
		int h3 = p3.hashCode();

		System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
