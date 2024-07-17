package com.oop;

public class BankAccount implements Cloneable{
	
	public double balance ;
	public BankAccount(double b) {
		this.balance =b;
	}
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	

}
