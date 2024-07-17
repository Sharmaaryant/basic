package com.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {
		
		TreeSet s = new TreeSet();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("z");
		s.add("b");
		s.add("z");
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
