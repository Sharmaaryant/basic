package com.collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQ {

	public static void main(String[] args) {
		
		Deque q = new ArrayDeque();
		q.add(100);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(9);
		q.add(14);
		q.add(19);
		q.addFirst(99);
		q.addLast(0);
		
		System.out.println(q.element());
		System.out.println(q.remove());
		System.out.println(q.removeFirst());
		System.out.println(q.removeLast());
		
		Iterator i = q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
