package com.collection.map;

import java.util.HashMap;
import java.util.Set;

public class Hash {
public static void main(String[] args) {
	

	HashMap map = new HashMap();
	map.put("ritesh", 5);
	map.put(null, 2);
	map.put("ram", 9);
	map.put("shayam", 3);
	map.put(null, 4);
	
     System.out.println( map.get("ritesh"));//get the value by key
	System.out.println(map.remove(null));

	System.out.println(map.keySet());
	System.out.println(map.entrySet());

}
}