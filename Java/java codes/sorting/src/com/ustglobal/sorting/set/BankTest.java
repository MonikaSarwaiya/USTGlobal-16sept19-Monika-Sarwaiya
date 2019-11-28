package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BankTest {

	public static void main(String[] args) {

		SortByName sb = new SortByName();
		SortByPincode sbp = new SortByPincode();
		SortByMICR sbc = new SortByMICR();
		
		//TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		//TreeSet<Bank> ts = new TreeSet<Bank>(sbp);
		TreeSet<Bank> ts = new TreeSet<Bank>(sbc);

		Bank b1 = new Bank("SBI", 560068, 6768689);
		Bank b2 = new Bank("CBI", 560071, 6768690);
		Bank b3 = new Bank("Kotak811", 560069, 6768686);
		Bank b4 = new Bank("HDFC", 560070, 6768681);
		Bank b5 = new Bank("HDFC", 560070, 6768681);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("*********Using iterator*********** ");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("===================");
		}
	}

}
