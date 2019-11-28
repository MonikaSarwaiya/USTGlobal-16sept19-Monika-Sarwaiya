package com.ustglobal.exception.first;

public class TestPayTM {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		PayTM p = new PayTM();
		try {
			
		p.book();
		
		} catch(ArithmeticException e) {
			
			System.out.println("Exception caught in main");
			
		} finally {
			
			System.out.println("Executing finally");
			
		}
		
		System.out.println("Main ended");
	}
}
