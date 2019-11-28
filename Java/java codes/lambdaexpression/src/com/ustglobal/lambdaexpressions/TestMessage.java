package com.ustglobal.lambdaexpressions;

public class TestMessage {

	public static void main(String[] args) {

		MessageInterface m = (msg)->{System.out.println("HI");
		                              System.out.println("Hello");
		                              System.out.println(msg);};
		m.greet("Deepesh");
		
	}

}
