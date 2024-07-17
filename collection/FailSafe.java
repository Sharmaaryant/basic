package com.collection;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafe {

	public static void main(String[] args) {
		
		ArrayBlockingQueue a = new ArrayBlockingQueue(9);
		a.add(8);
		a.add(2);
		a.add(7);
		
		Iterator i = a.iterator();
		a.add(1);
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
