package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ComparableTest {

	public static void main(String[] args) {
		
	ArrayList a = new ArrayList();
	a.add(new ComparableExam("Aitesh", 85));
	a.add(new ComparableExam("Ritesh", 83));
	
	Collections.sort(a);
	
		
		  for (int i = 0; i < a.size(); i++) {
		  
		  System.out.println(a.get(i)); }
		 
	
		/*
		 * Iterator i = a.iterator(); while(i.hasNext()) { System.out.println(i.next());
		 * }
		 */
	}
}
