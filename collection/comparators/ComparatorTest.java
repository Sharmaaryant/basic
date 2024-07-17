package com.collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorTest {


	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(new ComparatorExam("Ritesh","Patidar", 1));
		a.add(new ComparatorExam("Ritesh","Patidar", 8));
		a.add(new ComparatorExam("b","Pati", 4));
		a.add(new ComparatorExam("Ab","Patidar", 4));
		a.add(new ComparatorExam("Ac","atidar", 4));
		a.add(new ComparatorExam("Abc","Patidar", 4));
		
		
		Collections.sort(a, new ShortByName());
		
		/*
		 * for (int i = 0; i < a.size(); i++) {
		 * 
		 * System.out.println(a.get(i)); }
		 */
		
		Iterator i = a.iterator();
		
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	}
}