package com.ustglobal.thread.defining;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main Started");
		
		MyThread t1 = new MyThread();
		t1.start();
		
		for(int i = 0;i < 10;i++) {
			
			System.out.println("Main Thread");
		}
		
		System.out.println("Main ended");
	}

}
