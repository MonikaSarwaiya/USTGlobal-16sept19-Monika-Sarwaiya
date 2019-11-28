package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {

		int[] nums = {10, 20, 30, 40, 50};
		//	System.out.println(nums[10]); ArrayIndexOutOfBoundException
		
		receive(nums); //Passing Array as a parameter
		int[] values = getArray();
		
		for(int val : values) {
			System.out.println(val);
		}
		
		String[] names = {"Deepesh", "DK", "Afreen", "Monika"};
		receiveString(names);
		String[] name1 = getString();
		
		for(String nm : name1) {
			System.out.println(nm);
		}

	}
	
	static String[] getString() {
		
		String[] names = {"Deepesh", "Afreen", "Monika"};
		return names;
	}
	
	static void receiveString(String[] names) {
		
		for(String name : names) {
			System.out.println(name);
			System.out.println("--------------------");
		}
	}
	static void receive(int[] numbers) {
		
		for(int num : numbers) {
			System.out.println(num);
			System.out.println("-------------------");
		}
	}
	static int[] getArray() {
		
		int[] values = {20, 30, 40, 50};
		return values;
	}
}
