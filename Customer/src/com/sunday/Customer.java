package com.sunday;

import lombok.ToString;

@ToString
public class Customer implements Comparable<Customer> {
	
	String cid;
	String cname;
	String caddr;
	
	@Override
	public int compareTo(Customer customer) {
		int val = this.cid.compareTo(customer.cid);
		
		return val;
	}

	public Customer(String cid, String cname, String caddr) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddr = caddr;
	}

}
