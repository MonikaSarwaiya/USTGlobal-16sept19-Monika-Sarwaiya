package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {

		if(b1.pincode > b2.pincode) {

			return 1;
		} else if(b1.pincode < b2.pincode) {

			return -1;
		} else {

			return 0;
		}
	}

}
