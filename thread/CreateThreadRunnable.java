package com.thread;

public class CreateThreadRunnable implements Runnable {

	@Override
	public void run() {

		
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		CreateThreadRunnable c = new CreateThreadRunnable();
		Thread t = new Thread(c);
		t.start();
	}
}
