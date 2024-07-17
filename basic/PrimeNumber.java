
package com.basic;

public class PrimeNumber {
public static void main(String[] args) {
	

	int prime = 3;
	int count =0;
	for(int i =2; i<prime ; i++) {
		if(prime % i==0) {
			count++;
		}
	}if(count==0) {
		System.out.println("is prime no.");
	}else {
		System.out.println("is not prime no.");
	}
}
}
