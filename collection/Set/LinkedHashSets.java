package com.collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		
		LinkedHashSet s = new LinkedHashSet();
		s.add("one");
		s.add("two");
		s.add("zero");
		s.add("five");
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
