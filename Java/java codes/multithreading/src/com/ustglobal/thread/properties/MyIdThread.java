package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("MyId thread "+mi.getId());
		
		//mi.setId(); we can not set the id
		System.out.println("Priority "+Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(16); java.lang.IllegalArgumentException
		
		System.out.println("Main ended");
	}

}
