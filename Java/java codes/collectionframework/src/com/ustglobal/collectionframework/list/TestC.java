package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good evening");

		Iterator it = al.iterator();
		Object obj = it.next();
		System.out.println("obj1 "+obj);

		Object obj1 = it.next();
		System.out.println("obj2 "+obj1);

		Object obj2 = it.next();
		System.out.println("obj3 "+obj2);

		Object obj3 = it.next();
		System.out.println("obj4 "+obj3);

		boolean b = it.hasNext();
		System.out.println("Has Next "+b);

		/*
		 * Object obj4 = it.next(); System.out.println("obj5 "+obj4);
		 * NoSuchElementException
		 */

		System.out.println("=====Using for loop=====");

		for(int i = 0;i < al.size();i++) {
			Object o = al.get(i);
			System.out.println(o);
		}

		ArrayList al1 = new ArrayList();
		al1.add(22);
		al1.add(86.7);
		al1.add(false);
		al1.add("Good Night");

		System.out.println("==========Using Iterator===========");

		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}

		System.out.println("=============Using for loop==================");

		/*for(;it1.hasNext();) {
			Object o = it1.next();
			System.out.println(o);*/
		}
	}


