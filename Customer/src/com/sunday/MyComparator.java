package com.sunday;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		Customer customer1 = o1;
		Customer customer2 = o2;
		
		int val = customer1.cid.compareTo(customer2.cid);
		return val;
	}

}
