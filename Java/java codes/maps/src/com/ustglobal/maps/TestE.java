package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestE {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();

		l.put("Bangalore", 560068);
		l.put("Nagda", 456335);
		l.put("Indore", 456331);
		
		for(Map.Entry<String, Integer> m : l.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key+" ---- "+"Value is "+value);
			System.out.println("-------------------");
		}
	}

}
