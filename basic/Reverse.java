package com.basic;

public class Reverse {
public static void main(String[] args) {
	

	int num =123 ,rem =0;
	while(num !=0) {
		rem = rem*10+num%10;
		num=num/10;
		
	}System.out.println(rem);
}	
}
