package com.thread;

public class CreateThread extends Thread {

	@Override
	public void run() {

		System.out.println(Thread.currentThread());
		System.out.println("Thread is run");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		CreateThread c = new CreateThread();
		c.setName("Ritesh");
		c.start();
		CreateThread a = new CreateThread();
		a.setName("Rit");
		a.start();
	}
}
