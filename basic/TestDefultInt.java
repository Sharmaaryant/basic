package com.basic;

public class TestDefultInt {

	public static void main(String[] args) {
		DefaultInt d =new DefaultInt() {
			
			public  void add() {
				
			}
		};
		d.defMeth();
		DefaultInt.staMeth();
	}
}
