package com.basic;

public class Armstrong {
public static void main(String[] args) {
	

	int n=407,r,sum=0,p=n;
	
	while(n>0) {
		
		r=n%10;
		n=n/10;
		sum =sum +(r*r*r);
	}if(sum==p) {
		System.out.println(sum + "is armstrong");
	}else {
		System.out.println("is not armstrong");
	}
}
}