package com.basic;

public class AnnoyExa {
public static void main(String[] args) {
	
	Adding a = new Adding() {

		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
		
	};

	int c=a.add(4, 8);
	System.out.println(c);
}
}
