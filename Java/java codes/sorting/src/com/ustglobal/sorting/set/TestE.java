package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(34);
		t.add(45);
		t.add(12);
		t.add(9);
		t.add(39);
		t.add(45);
		//t.add(null);
		//t.add(null); NullPointerException
		//t.add("DK");  only add generics or only add either integer or and so on.but not all at
		//same time.it will throw ClassCastException
		
		System.out.println("=====Using for each===========");
		for(Object d : t) {
			
			System.out.println(d);
		}
		
		System.out.println("========Iterator========");
		Iterator it = t.iterator();
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
		}
	}

}
