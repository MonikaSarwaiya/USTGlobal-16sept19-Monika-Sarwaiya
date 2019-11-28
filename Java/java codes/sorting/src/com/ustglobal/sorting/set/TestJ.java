package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {

		Comparator<Employee2> comp = (e1, e2) -> {
			
			if(e1.id > e2.id) {
				
				return 1;
			} else if(e1.id < e2.id) {
				
				return -1;
			} else {
				
				return 0;
			}
		};

		TreeSet<Employee2> ts = new TreeSet<Employee2>(comp);
		
		Employee2 e1 = new Employee2(4, "Deepesh", 5.8);
		Employee2 e2 = new Employee2(1, "Deepu", 5.7);
		Employee2 e3 = new Employee2(5, "DK", 5.9);
		Employee2 e4 = new Employee2(2, "Dev", 4.5);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("******Using iterator************");
		Iterator<Employee2> it = ts.iterator();
		while(it.hasNext()) {
			
			Employee2 e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("==================");

		}
	}
	}

