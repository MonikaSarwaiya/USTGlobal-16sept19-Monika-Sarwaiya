package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestH {

	public static void main(String[] args) {

		Employee e1 = new Employee(5, "Deepesh", 88000.89);
		Employee e2 = new Employee(2, "DK", 86000.89);
		Employee e3 = new Employee(7, "Deepu", 80000.89);
		Employee e4 = new Employee(12, "Dev", 98000.89);
		Employee e5 = new Employee(35, "Deepak", 78000.89);
		Employee e6 = new Employee(55, "Afreen", 86000.88);
		Employee e7 = new Employee(8, "Monika", 82000.78);
		Employee e8 = new Employee(4, "Shubhi", 79000.25);
		Employee e9 = new Employee(1, "Khushi", 92000.75);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("Manager-1", al);
		hm.put("Manager-2", al1);
		hm.put("Manager-3", al2);
		
		System.out.println("Employee under Manager-1:");
		ArrayList<Employee> first = hm.get("Manager-1");
		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.sal);
			System.out.println("===================");
		}
		
		System.out.println("Employee under Manager-2:");
		ArrayList<Employee> second = hm.get("Manager-2");
		
		Iterator<Employee> it1 = second.iterator();
		while(it1.hasNext()) {
			
			Employee e = it1.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.sal);
			System.out.println("===================");
		}
		
		System.out.println("Employee under Manager-3:");
		ArrayList<Employee> third = hm.get("Manager-3");
		
		Iterator<Employee> it2 = third.iterator();
		while(it2.hasNext()) {
			
			Employee e = it2.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.sal);
			System.out.println("===================");
		}
	}

}
