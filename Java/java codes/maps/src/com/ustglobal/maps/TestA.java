package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		hm.put("Deepesh", 998017);
		hm.put("DK", 998014);
		hm.put("Deepu", 678941);
		hm.put("Dev", 789789);
		hm.put(null, 456335);
		hm.put(null, 456331);
		
		System.out.println("Data "+hm);
		System.out.println("================");
		
		hm.put("Deepesh", 789899);
		System.out.println("After modify "+hm);
		System.out.println("===================");
		
		hm.put("Deepak", 789899);
		System.out.println("After Deepak "+hm);
		System.out.println("====================");
		
		Object phoneno = hm.get("DK");
		System.out.println("Value "+phoneno);
		System.out.println("==================");
		
		Object phoneno1 = hm.get("Monika");
		System.out.println("Value "+phoneno1);
		System.out.println("================");

		Object value = hm.remove("Deepak");
		System.out.println("Value "+value);
		
		System.out.println("================");
		
		System.out.println("After remove "+hm);

	}

}
