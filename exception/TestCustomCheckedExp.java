package com.exception;

public class TestCustomCheckedExp  {
	public static void main(String[] args)  {
		
		int i = 9;
		try {
			if(i==9) {
				throw new CustomCheckedException();
			}
		}catch(CustomCheckedException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
