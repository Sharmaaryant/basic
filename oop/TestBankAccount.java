
package com.oop;

public class TestBankAccount {

	public static void main(String[] args) throws CloneNotSupportedException  {
		
		BankAccount a = new BankAccount(10);
		BankAccount b = (BankAccount) a.clone();
		b.balance =23;
		System.out.println(a.balance);
		System.out.println(b.balance);
		
	}
}
