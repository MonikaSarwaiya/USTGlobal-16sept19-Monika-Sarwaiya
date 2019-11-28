package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {

		Predicate<Teacher> p = t -> {
			
			if(t.sal >= 35000) {
				
				return true;
			} else {
				
				return false;
			}
		};
		
		Teacher t = new Teacher(1, "DK", 25000);
		boolean b = p.test(t);
		System.out.println("Result : "+b);
	}

}
