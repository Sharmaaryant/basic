package com.collection;

import java.util.Enumeration;
import java.util.Stack;

public class Enumerations {

	public static void main(String[] args) {
		
		Stack  s = new Stack();
		s.add(5);
		s.add(8);
		s.add(9);
		s.add(7);
		s.add(5);
		s.add("ritesh");
		Enumeration e = s.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
