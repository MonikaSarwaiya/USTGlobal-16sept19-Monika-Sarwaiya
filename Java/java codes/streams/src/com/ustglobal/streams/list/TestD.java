package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(23);
		marks.add(50);
		marks.add(12);
		marks.add(45);
		marks.add(24);
		
		Comparator<Integer> cmp = (m1, m2) -> {
			
			if(m1 > m2) {
				
				return 1;
			} else if(m1 < m2) {
				
				return -1;
			} else {
				
				return 0;
			}
		};
		
		long noOfFailStudents = marks.stream().filter(i -> i < 40).count();
		System.out.println(noOfFailStudents);
		
		System.out.println("==================");

		Integer i = marks.stream().min(cmp).get();
		System.out.println("Min value "+i);
		
		System.out.println("==============");
		Integer j = marks.stream().max(cmp).get();
		System.out.println("Max value "+j);
	}

}
