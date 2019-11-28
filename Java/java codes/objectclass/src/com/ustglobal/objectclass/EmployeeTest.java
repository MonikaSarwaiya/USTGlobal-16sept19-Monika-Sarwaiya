package com.ustglobal.objectclass;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee(1, "DK", 10000);

		Employee e1 = new Employee(2, "Deepu", 20000);

		Employee e2 = new Employee(1, "DK", 10000);

		Employee e3 = e2;

		System.out.println(e.equals(e1));
		System.out.println(e.equals(e2));
		System.out.println(e3.equals(e2));

		int h = e.hashCode();
		int h1 = e1.hashCode();
		int h2 = e2.hashCode();
		int h3 = e3.hashCode();

		System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

	}

}
