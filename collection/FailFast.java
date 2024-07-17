package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(5);
		l.add(8);
		l.add(9);
		
		Iterator i = l.listIterator();
		l.add(2);
		
		while(i.hasNext()) {
			System.out.println(i.next());//ConcurrentModificationException
		}
	}
}
