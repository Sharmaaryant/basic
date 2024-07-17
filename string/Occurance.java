package com.string;

public class Occurance {

	

		public static void main(String[] args) {

			String r ="ritersh patidar";
			int count =0;
			
			for(char a='0'; a<='z'; a++) {
				
				for(int i= 0; i<r.length();i++) {
					if(r.charAt(i)==a) {
						count++;
					}
				}
				if(count!=0) {
					System.out.println(a +"=" + count);
					count=0;
				}
			}
					
		
		
		
		
		}

	}

