package com.exc;

public class TestUnchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=12;
		if(user<18)
		{
			throw new CustomUnchecked();
		}
		else {
			System.out.println("successfully attemp");
		}

	}

}
