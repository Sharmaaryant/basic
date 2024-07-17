package com.thread;

public class Account {

	int balance;
	
	public void Deposit(String msg , int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + "New Balance " + bal) ;
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance=balance;
	}
	
}
