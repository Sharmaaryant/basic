package com.exc;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			authenticate("sapna","sapna12");
		}
		catch(LoginException e)
		{
		System.out.println(e.getMessage());	
		}
	}
		public static void authenticate(String login,String pwd)
				throws LoginException {
			boolean flag = true;
			String u=login;
			if (flag) {
				throw new LoginException();
			}
	}

}
