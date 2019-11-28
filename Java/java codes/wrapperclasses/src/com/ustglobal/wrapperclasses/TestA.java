package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("A is "+a);
		Integer i = a; //Primitive is converted into non-primitive that is Autoboxing
		System.out.println("I is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("X is "+x);
		int y = x; //Unboxing auto un boxing
		System.out.println("Y is "+y);
		
		int value = Integer.parseInt("123");
		System.out.println("Value is "+value);
		
		Boolean result = Boolean.parseBoolean("123true");
		System.out.println("Result is "+result);
		
		Boolean result1 = Boolean.parseBoolean("true");
		System.out.println("Result1 is "+result1);
		
		/*
		 * int value1 = Integer.parseInt("123String"); //NumberFormatException
		 * System.out.println("Value is "+value);
		 */
	}
}
