package com.oop;

public class ConstCalling {

	private int a;
	private int b;
	private String c;
	
	public ConstCalling(int a,int b, String c) {
		this(a,b);
		this.c =c;
		System.out.println("3 parameter");
	}
	
	public ConstCalling(int a,int b) {
		this.a=a;
		this.b =b;
		System.out.println("2 parameter");
	}
}
