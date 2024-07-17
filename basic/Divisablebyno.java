package com.basic;

public class Divisablebyno {

	public static void main(String[] args) {
		
		int num =7;
		int count =0; ;
		
		for(int i =1; i<=100; i++) {
			if(i%num==0) {
				 count = count +i;
								System.out.print(i +" ");
							}
		} System.out.println("   "+"total sum of divisable by no:" + count);


	}
}
