package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();
		lh.add(34);
		lh.add("Deepesh");
		lh.add(89.6);
		lh.add(34);
		lh.add("DK");
		lh.add(null);
		lh.add(null);
		
		System.out.println("======Using for each========");
		for(Object o : lh) {
			
			System.out.println(o);
		}
		
		System.out.println("=======using iterator======");
		Iterator it = lh.iterator();
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
		}
	}

}
