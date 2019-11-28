package com.ustglobal.lambdaexpressions;

public class TestHi {

	public static void main(String[] args) {

		HiInterface h = ()->{System.out.println("Hi DK");
		};
		h.sayHi();
	}
}
