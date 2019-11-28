package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {

		LinkedHashSet<Double> lh = new LinkedHashSet<>();
		lh.add(89.5);
		lh.add(78.56);
		lh.add(78.17);
		lh.add(98.99);
		lh.add(99.99);
		
		System.out.println("=====Using for each===========");
		for(Double d : lh) {
			
			System.out.println(d);
		}
		
		System.out.println("========Iterator========");
		Iterator<Double> it = lh.iterator();
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
		}
	}

}
