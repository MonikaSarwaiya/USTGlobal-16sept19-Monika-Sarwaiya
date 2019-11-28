package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByNameCustomer implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		String s = c1.name;
		String s1 = c2.name;
		
		return s.compareTo(s1);
	}
	
	

}
