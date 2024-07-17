package com.exc;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sapna";
		try {
			
			System.out.println(s.charAt(10));
			
		} catch (StringIndexOutOfBoundsException e2) {
			e2.printStackTrace();
		

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		catch (NullPointerException e1) {
			System.out.println(e1.getMessage());

			
		}

		finally {
			System.out.println("i am finally bloack");
		}

	}

}
