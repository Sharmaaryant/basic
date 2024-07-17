package com.exc;

public class TestException {
public static void main(String[] args) throws LoginException{
	int user=12;
	try {
		if(user<18)
		{
			throw new LoginException();
		}
	}
	catch(LoginException e)
	{
	System.out.println(e.getMessage());	
	}
}
}
