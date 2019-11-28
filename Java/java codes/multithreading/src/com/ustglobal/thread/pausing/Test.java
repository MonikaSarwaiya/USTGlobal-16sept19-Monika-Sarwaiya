package com.ustglobal.thread.pausing;

public class Test {

	public static void main(String[] args) {

		System.out.println("Main started");
		Counter c = new Counter();
		
		Runnable r = () -> {
			c.increment();
			c.showValue();
		};
		
		Runnable r1 = () -> {
			c.decrement();
			c.showValue();
		};
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		t.start();
		t1.start();
		
		System.out.println("Main ended");
	}

}
