package com.exc;

public class ParentHandleChildException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=null;
try {
	System.out.println(str.length());
	//System.out.println(str.charAt(6));
}
catch(RuntimeException e)
{
	System.out.println(e.getMessage());
}

	}

}
