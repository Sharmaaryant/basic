package com.thread;

public class RaccingCondition extends Thread {

	
	public static Account a = new Account();
	
	public RaccingCondition(String name) {
		super(name);
	}
	
	@Override
	public void run() {
	
		for (int i = 0; i <5; i++) {
			
			a.Deposit(getName(),1000);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		RaccingCondition r = new RaccingCondition("Ritesh");
		RaccingCondition r1 = new RaccingCondition("Ram");
		r.start();
		r1.start();
		
	}
}
