package com.basic;

import java.util.Scanner;

public class sccanerrev {

	public static void main(String[] args) {
		
		int n;
		int count = 0;
		System.out.println("enter no.");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		 
		for(int i =2; i<n-1; i++) {
			if(n%i==0) {
				count++;
			}
		}if(count==0) {
			System.out.println("prime no.");}
			else {
				System.out.println("not a prime no.");
			}
		}
	}

