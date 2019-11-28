package com.ustglobal.objectclass;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s = new Student(5, "Deepesh", 86.2);
		System.out.println(s);
		
		int h = s.hashCode();
		System.out.println(h);
		
		Student s1 = new Student(05, "DK", 86.17);
        System.out.println(s1);
	}
}
