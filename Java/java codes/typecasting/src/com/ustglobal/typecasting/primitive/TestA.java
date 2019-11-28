package com.ustglobal.typecasting.primitive;

public class TestA {
public static void main(String[] args) {
	byte b = 10;
	int a = b; //Implicit casting
	System.out.println("a is "+a);
	
	int p = 20;
	double d = p;
	System.out.println("d is "+d);
	System.out.println("---------------------------------");
	
	double x = 20.67;
	int y = (int) x;
	System.out.println("Y is "+y);
	
	byte z = (byte) x;
	System.out.println("Z is "+z);
	
	double e = 68.70;
	char r = (char) e;
	System.out.println("R is "+r);
}
}
