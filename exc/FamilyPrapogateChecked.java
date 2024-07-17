package com.exc;

public class FamilyPrapogateChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dad();
	}
		public static void dad()
		{
			try {
				mom();
			}
			catch(FamilyPrapogate e)
			{
				System.out.println(e.getMessage());
			}
		}
		public static void mom()throws FamilyPrapogate
		{
			try {
			son();
			}
			catch(FamilyPrapogate e1)
			{
				System.out.println(e1.getMessage());
			}
		}
		public static void son() throws FamilyPrapogate
		{
			
			FamilyPrapogate em= new FamilyPrapogate();	
		
		throw em;
		}
		

	}



