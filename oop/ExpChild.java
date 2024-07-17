package com.oop;

public class ExpChild extends Explicits{

	private String name;
	private int id;
	private String save;
	public ExpChild(String n, int i ,String s ) {
		super(n,i);
		this.save=s;
		System.out.println(n+i+s);
	}
	
}
