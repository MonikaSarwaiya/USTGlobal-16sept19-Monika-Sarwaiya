package com.ustglobal.exception.first;

public class TestA {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int[] a = {10, 20, 30};
		
		System.out.println(a[1]);
		
		try {
			System.out.println(a[2]);
			System.out.println(a[3]); //Here Exception occurs
			System.out.println(a[0]); //It will not executed
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not present");
		}
		
		System.out.println("Main ended");
	}
}
