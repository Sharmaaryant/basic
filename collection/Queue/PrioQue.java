package com.collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.management.Query;

public class PrioQue {

	public static void main(String[] args) {
		
		Queue q =new PriorityQueue();
		//q.add(null);
		q.add(1);
		q.add(2);
		q.add(6);
		q.add(8);
		//q.add("Ritesh");
		q.add(3);
		System.out.println(q.element());
		System.out.println(q.remove());
		
		Iterator i = q.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() +" ");
		}
	}
}
