package com.oop;

public class HomeLoan {

	public static void main(String[] args) {
		
		Bank[] bank = new Bank[4];
		bank[0]= new AxisBank();
		bank[1] = new HDFCBank();
		bank[2] =new SBIBank();
		bank[3] = new Bank();
		//loanEnquiry(bank);
		for(Bank b :bank) {
			 String name = b.getName();
			 double rate =b.interestRate();
			 System.out.println(name +"= " + rate);
		 }
	}

	/* static void loanEnquiry(Bank[] bank) {
		
		 for(Bank b :bank) {
			 String name = b.getName();
			 double rate =b.interestRate();
			 System.out.println(name +"= " + rate);
		 }*/
	
}
