package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {

	public static void main(String[] args) {

		ArrayList<Pen> al = new ArrayList<>();
		
		Pen p = new Pen(50, "Cello");
		Pen p1 = new Pen(80, "Nataraj");
		Pen p2 = new Pen(40, "Doms");
		Pen p3 = new Pen(30, "Streamer");
		
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		System.out.println("Before sorting---->");
		displayPenDetails(al);
		System.out.println("After sorting----->");
		Collections.sort(al);
		displayPenDetails(al);

	}

	static void displayPenDetails(ArrayList<Pen> p) {
		
		Iterator<Pen> it = p.iterator();
		while(it.hasNext()) {
			
			Pen p4 = it.next();
			System.out.println("Brand is "+p4.brand);
			System.out.println("Price is "+p4.price);
			
			System.out.println("===================");
		}
	}
}
