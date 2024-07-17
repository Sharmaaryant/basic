package com.thread;

public class Priority extends Thread {

	public Priority(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i <5; i++) {
			System.out.println(getName()+" p = " + getPriority());
			
		}
	}
	public static void main(String[] args) {
		
		Priority p = new Priority("#A");
		Priority p1 = new Priority("#B");
		Priority p2 = new Priority("#C");
		//Priority p3 = new Priority("#D");
		p.setPriority(1);
		p1.setPriority(4);
		p2.setPriority(10);
		//p3.setPriority(6);
		p.start();
		p1.start();
		p2.start();
		//p3.start();
	}
}
