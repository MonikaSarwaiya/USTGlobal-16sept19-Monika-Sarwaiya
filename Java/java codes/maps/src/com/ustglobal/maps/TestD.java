package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestD {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
		
		l.put("Bangalore", 560068);
		l.put("Nagda", 456335);
		l.put("Indore", 456331);
		
		System.out.println(l);
		
		System.out.println("============");
		
		Set<String> s = l.keySet();
		
		for(String key : s) {
			
			System.out.println("Key "+key);
		}
		
		System.out.println("===============");
		
		Collection<Integer> c = l.values();
		
		for(Integer value : c) {
			
			System.out.println("Value "+value);
		}
	}

}
