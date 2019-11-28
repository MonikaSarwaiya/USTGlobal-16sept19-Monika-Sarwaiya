package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("Deepesh", 998017);
		hm.put("DK", 998014);
		hm.put("Dev", 789789);
		
		HashMap hm1 = new HashMap();
		
		hm1.put("Deepu", 678941);
		hm1.put("Afreen", 678909);
		hm1.put("Monika", 467787);

		boolean b = hm.containsKey("Dev");
		System.out.println("Present Status "+b);
		
		System.out.println("====================");
		
		boolean value = hm.containsValue(678909);
		System.out.println("Contains value status "+value);
		
		hm.putAll(hm1);
		
		System.out.println("==============");
		
		System.out.println("After put all "+hm);
		
		System.out.println("==============");

		System.out.println(hm.size());
		
		System.out.println("==============");

		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty status "+isEmpty);
		
		System.out.println("==============");

		hm.clear();
		System.out.println("After clear "+hm);
	}

}
