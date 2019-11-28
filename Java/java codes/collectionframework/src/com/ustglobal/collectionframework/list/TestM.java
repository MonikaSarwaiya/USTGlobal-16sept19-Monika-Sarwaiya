package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestM {

	public static void main(String[] args) {

		Stack<Student> al = new Stack<Student>();
		Student s = new Student(101, "Deepesh", 86.20);
		Student s1 = new Student(102, "DK", 86.17);
		Student s2 = new Student(103, "Deepu", 82.90);
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		
		for(int i = 0; i < al.size(); i++) {
			Student s3 = al.get(i);
			System.out.println("Id is "+s3.id);
			System.out.println("Name is "+s3.name);
			System.out.println("Percentage is "+s3.percentage);
			
		}
		System.out.println("========for each============");
		for(Student s3 : al) {
			System.out.println(s3);
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
