package com.thread;


	public class PriorityThread extends Thread {
		public PriorityThread(String name) {
			super(name);
		}
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(getName()+"p="+getPriority());
			}
		}
		public static void main(String[] args) {
			
		
		
		PriorityThread t1=new PriorityThread("ruchi");
		PriorityThread t2=new PriorityThread("rohan");
		PriorityThread t3=new PriorityThread("nidhi");
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
}
}