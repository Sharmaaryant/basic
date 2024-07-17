package com.collection.map;

import java.util.Hashtable;
import java.util.Iterator;

public class HasTable {
public static void main(String[] args) {
	
	Hashtable map = new Hashtable();
	map.put("Ritesh", 8);
	map.put("Pankaj", 4);
	map.put("Shubham", 9);
	map.put("Yuvi", 2);
	map.put("Aryant", 1);
	
	System.out.println(map.get("Ritesh"));
	for(Object o: map.keySet()) {
		System.out.println(o + "== " +map.get(o));
	}
}
}
