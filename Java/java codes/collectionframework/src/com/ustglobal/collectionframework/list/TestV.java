package com.ustglobal.collectionframework.list;

import java.util.LinkedList;
import java.util.Collections;

public class TestV {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(13);
		ll.add(34);
		ll.add(3);
		ll.add(10);
		//ll.add(null); we get NullPointerException
		
		System.out.println("Before sort "+ll);
		Collections.sort(ll);
		System.out.println("After sort "+ll);
		
		Collections.reverse(ll);
		System.out.println("After reverse "+ll);
		
		Collections.shuffle(ll);
		System.out.println("After shuffle "+ll);
		
		
	}

}
