package com.basic;

public class Palindrom {
public static void main(String[] args) {
	int num = 121;
	int r = 0;
	int p=num;
	
	while(num>0) {
		r = r*10+ num%10;
		num= num/10;}
	if(r==p) {
		System.out.println("is palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
	}
	
}

