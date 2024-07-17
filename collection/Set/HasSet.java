package com.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
//HashSet does not allow duplicate value to be added
	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		s.add("Ritesh");
		s.add(1);
		s.add(2);
		s.add(9);
		s.add(8);
		s.add(5);
		
		Iterator i  = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
