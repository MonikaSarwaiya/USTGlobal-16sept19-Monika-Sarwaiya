package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestN {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e = new Employee(101, "Deepesh", 86000.20);
		Employee e1 = new Employee(102, "DK", 86000.17);
		Employee e2 = new Employee(103, "Deepu", 82000.90);
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		for(int i = 0; i < al.size(); i++) {
			Employee e3 = al.get(i);
			System.out.println("Id is "+e3.id);
			System.out.println("Name is "+e3.name);
			System.out.println("Percentage is "+e3.sal);
			
		}
		System.out.println("========for each============");
		for(Employee e3 : al) {
			System.out.println(e3);
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
