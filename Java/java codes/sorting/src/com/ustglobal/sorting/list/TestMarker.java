package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {

	public static void main(String[] args) {

		ArrayList<Marker> al = new ArrayList<>();
		
		al.add(new Marker("blue", 50));
		al.add(new Marker("red", 70));
		al.add(new Marker("green", 80));
		al.add(new Marker("black", 40));
		
		System.out.println("Before sorting---->");
		display(al);
		
		SortByPriceMarker sb = new SortByPriceMarker();
		SortByColorMarker sbc = new SortByColorMarker();
		
		//Collections.sort(al, sb);
		Collections.sort(al, sbc);

		System.out.println("After sorting----->");
		display(al);
	}

	static void display(ArrayList<Marker> m) {
		
		Iterator<Marker> it = m.iterator();
		while(it.hasNext()) {
			
			Marker m1 = it.next();
			System.out.println("Color is "+m1.color);
			System.out.println("Price is "+m1.price);
			
			System.out.println("====================");
		}
	}
}
