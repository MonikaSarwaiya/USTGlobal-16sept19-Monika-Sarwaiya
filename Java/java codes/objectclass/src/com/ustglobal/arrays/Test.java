package com.ustglobal.arrays;

public class Test {

	public static void main(String[] args) {

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("-----------------------------");
		int[] nums = {10, 20, 30, 40, 50};
		
		for(int a : nums) {
			System.out.println(a);
		}
		System.out.println("------------------------------");
		double[] d = {58.76, 68.78, 97.87, 89.20, 78.20};
		
		for(int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("****************************");
		for(double i : d) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		byte[] b = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("*******************************");
		for(byte i : b) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		boolean[] bl = {true, false, false, true, true};
		
		for(int i = 0; i < bl.length; i++) {
			System.out.println(bl[i]);
		}
		System.out.println("*******************************");
		for(boolean i : bl) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		
		String[] names = {"Deepesh", "DK", "Afreen", "Monika", "Dev"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("*******************************");
		for(String i : names) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		char[] c = {'a', 'b', 'c', 'd', 'e'};
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("*******************************");
		for(char i : c) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
	}

}
