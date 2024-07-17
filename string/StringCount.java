package com.string;

public class StringCount {
		
		public static void main(String[] args) {
   
			String s ="ritesh patidar";
			int count= 0;
			
			for(int i =0; i<s.length(); i++) {
				
				char c = s.charAt(i);
				
				String k = String.valueOf(c);
				
				if(k.matches("i")) {
					count++;
				}
				
			}System.out.println(count);
			
		}
}

