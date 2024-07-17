package com.oop;

public class DeepCloning {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer("Ritesh");
		Customer c1 = (Customer) c.clone();
		c1.name="Ritu";
		c1.account.balance =99;
		
		System.out.println("or object");
		System.out.println("Name :" +c.name) ;
		System.out.println("Balance :" +c.account.balance);
		
		System.out.println("cloned object");
		System.out.println("Name :" +c1.name);
		System.out.println("Balance :" + c1.account.balance);
		
	}

}
