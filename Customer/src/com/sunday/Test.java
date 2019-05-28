package com.sunday;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Customer c3 = new Customer("C-333", "Sample3", "Hyd");
		Customer c2 = new Customer("C-222", "Sample2", "Hyd");
		Customer c1 = new Customer("C-111", "Sample1", "Hyd");
		
		var myComparator = new MyComparator();
		var treeSet = new TreeSet<Customer>(myComparator);
		treeSet.add(c1);
		treeSet.add(c2);
		treeSet.add(c3);
		System.out.println(treeSet);
	}

}
