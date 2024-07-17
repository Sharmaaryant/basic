package com.thread;

public class Account1 {

	int balance;
	
	public synchronized void Deposit(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg +" current balance" + bal);
	}
	
	

	public int getBalance() {
		Delay();
		return balance;
	}

	public void setBalance(int balance) {
		Delay();
		this.balance = balance;
	}
	public void Delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}this.balance= balance;
	}
}
