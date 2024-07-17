package com.string;

public class TotalCount {
	
		
		   public static void main(String[] args) {
			
			  String s = "Ritesh Patidar     ";
			  
			 
			  int count = 0;
			  for(int i = 0; i<s.length(); i++) {
				  if(s.charAt(i) != ' ')    
		                count++;    
		        }    
			  
			   System.out.println("Total number of characters in a string: " + count);  
			   
		}

	}

