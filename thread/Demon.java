package com.thread;

public class Demon extends Thread {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread());
	while(true) {
			try {
				Thread.sleep(500);
				System.out.println("Demon WakeUp");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//	System.out.println("hiiiiiiiiiii");
		}

	}
	public static void main(String[] args) {
		
	
		System.out.println("Main Thread");
		
		Demon d = new Demon();
		//d.setDaemon(true);
	    d.start();
	    
	    try {
	    	Thread.sleep(2000);
	    }catch (Exception e) {

	    	System.out.println(e.getMessage());
	    }
	    System.out.println("now JVM Exit");
	
	
	
	
	
	}
}
