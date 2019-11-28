package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {

	public static void main(String[] args) {

		SortByNameCustomer sbc = new SortByNameCustomer();
		TreeSet<Customer> ts = new TreeSet<>(sbc);
		
		Customer c1 = new Customer("Deepesh", 05, 86000);
		Customer c2 = new Customer("DK", 10, 89000);
		Customer c3 = new Customer("Deepu", 7, 81000);
		Customer c4 = new Customer("Dev", 2, 80000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("*****Using iterator*****");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			
			Customer c = it.next();
			System.out.println("Name is "+c.name);
			System.out.println("Id is "+c.id);
			System.out.println("Salary is "+c.sal);
			System.out.println("==================");
		}

	}

}
