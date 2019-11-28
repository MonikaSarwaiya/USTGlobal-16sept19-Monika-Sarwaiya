package com.ustglobal.stringclass;

public class Test {
	public static void main(String[] args) {

		String s1 = "Deepesh";
		String s2 = "DK";

		String s3 = new String("Deepesh");
		String s4 = new String("Deepesh");
		String s5 = "Deepesh";

//		System.out.println(s1==s2);
//		System.out.println(s3==s4);
//		System.out.println(s1==s5);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s2.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("Deepesh");
		System.out.println(b);
        System.out.println("--------------------------------");
        
        StringBuffer sb = new StringBuffer("Deepesh ");
        System.out.println(sb);
        sb.append("Khandelwal");
        System.out.println(sb);
        
        System.out.println(s1.length());
	}
}
