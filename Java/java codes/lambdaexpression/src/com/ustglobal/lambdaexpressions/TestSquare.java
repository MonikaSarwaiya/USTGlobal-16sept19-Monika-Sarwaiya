package com.ustglobal.lambdaexpressions;

public class TestSquare {

	public static void main(String[] args) {

		SquareInterface s = (x)->x*x;
		int square = s.square(36);
		System.out.println("Square is "+square);
	}

}
