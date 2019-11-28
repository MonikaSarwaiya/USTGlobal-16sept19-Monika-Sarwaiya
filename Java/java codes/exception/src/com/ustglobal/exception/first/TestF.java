package com.ustglobal.exception.first;

public class TestF {

	public static void main(String[] args) {

		System.out.println("main started");

		String s = "Hello";
		int[] a = {10, 20, 30};
		int b = 10;
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		} 
		catch(NullPointerException ne) {
			System.out.println("Don't play with null");
		} 
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is not present");
		} 
		catch(ArithmeticException e) {
			System.out.println("Number divided by zero");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("main ended");
	}

}
