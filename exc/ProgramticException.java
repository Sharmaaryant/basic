package com.exc;

public class ProgramticException {
public static boolean isValidUser()
{
	return false;
}
public static void main(String[] args) {
	boolean userfound=isValidUser();
	if(userfound)
	{
		System.out.println("valid user");
	}
	else {
		RuntimeException e=new RuntimeException("invalid user");
		throw e;
	}
}
}
