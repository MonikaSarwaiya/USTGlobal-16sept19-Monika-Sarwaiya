package com.ustglobal.immutable;

public class TestString {

	public static void main(String[] args) {

		MyString m = new MyString(5, "Deepesh");
		System.out.println(m.getName());
		System.out.println(m.getRollNo());
		System.out.println(m);
		
		MyString m1 = m.changeContent(22, "DK");
		System.out.println(m.getName());
		System.out.println(m.getRollNo());
		
		System.out.println("=======================");
		
		System.out.println(m1.getName());
		System.out.println(m1.getRollNo());
	}

}
