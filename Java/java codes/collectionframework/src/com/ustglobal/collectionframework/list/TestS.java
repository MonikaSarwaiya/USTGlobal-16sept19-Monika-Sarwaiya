package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestS {

	public static void main(String[] args) {

		LinkedList<Teacher> al = new LinkedList<Teacher>();
		Teacher t = new Teacher(101, "Deepesh", "CSE");
		Teacher t1 = new Teacher(102, "DK", "ECE");
		Teacher t2 = new Teacher(103, "Deepu", "IT");
		
		al.add(t);
		al.add(t1);
		al.add(t2);
		
		for(int i = 0; i < al.size(); i++) {
			Teacher t3 = al.get(i);
			System.out.println("Id is "+t3.id);
			System.out.println("Name is "+t3.name);
			System.out.println("Percentage is "+t3.dept);
			
		}
		System.out.println("========for each============");
		for(Teacher t3 : al) {
			System.out.println(t3);
		}
		
		System.out.println("=============Using iterator===================");

		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("=============Using List Iterator forward===================");

		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("=============Using List Iterator backward===================");
		
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}

}
