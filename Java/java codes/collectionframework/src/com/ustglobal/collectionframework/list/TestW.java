package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestW {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Deepesh");
		al.add("DK");
		al.add("Deepu");
		al.add("Dev");
		
		System.out.println("Before sort-----> "+al);
		
		Collections.sort(al);
		
		System.out.println("After sort------> "+al);
	}

}
