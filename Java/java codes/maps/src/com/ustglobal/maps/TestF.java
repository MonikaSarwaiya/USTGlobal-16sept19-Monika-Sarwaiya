package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestF {

	public static void main(String[] args) {

		TreeMap<String, Integer> l = new TreeMap<String, Integer>();

		l.put("Bangalore", 560068);
		l.put("Nagda", 456335);
		l.put("Indore", 456331);
		//l.put(null, 898987); NullPointerException

		for(Map.Entry<String, Integer> m : l.entrySet()) {

			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key+" ---- "+"Value is "+value);
			System.out.println("-------------------");
		}


	}

}
