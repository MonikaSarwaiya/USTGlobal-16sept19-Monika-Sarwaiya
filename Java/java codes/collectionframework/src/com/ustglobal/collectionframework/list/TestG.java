package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("DK");
		li.add(true);
		li.add(null);

		System.out.println("=============Using for loop===================");

		for(int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("=============Using for each loop===================");

		for(Object o : li) {
			System.out.println(o);
		}

		System.out.println("=============Using iterator===================");

		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("=============Using List Iterator forward===================");

		ListIterator li1 = li.listIterator();
		while(li1.hasNext()) {
			Object o = li1.next();
			System.out.println(o);
		}
		
		System.out.println("=============Using List Iterator backward===================");
		
		while(li1.hasPrevious()) {
			Object o = li1.previous();
			System.out.println(o);
		}

	}

}
