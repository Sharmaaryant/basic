package com.collection.comparators;

import java.util.TreeSet;

public class TestMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		t.add(4);
		t.add(40);
		t.add(5);
		t.add(30);
		t.add(1);
		t.add(2);
		t.add(2);
		System.out.println(t);
	}

}
