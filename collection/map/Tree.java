package com.collection.map;

import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		map.put("ram", 1);
		map.put("shyram", 2);
		map.put("rom", 3);
		map.put("rm", 4);
		
		for(Object o: map.keySet()) {
			System.out.println(o + " =" + map.get(o));
		}
	}
}
