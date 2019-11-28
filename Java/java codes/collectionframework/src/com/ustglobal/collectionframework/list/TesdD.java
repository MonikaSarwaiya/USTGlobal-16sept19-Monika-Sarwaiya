package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TesdD {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(5);
		al.add(45.6);
		al.add("DK");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("------------------>Forward");
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("Backward<------------------------");
		
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}

}
