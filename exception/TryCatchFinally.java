package com.exception;

public class TryCatchFinally {
public static void main(String[] args) {
	

	try {
		String S ="Ritesh";
		System.out.println(S.charAt(15));
	} catch (Exception e) {

		System.out.println("bsss");
	
	}finally {
		System.out.println("Don ko rokna mumkin nahi na mumkin hai ");
	}
}
}