package com.string;

public class StringArrayOccurance {

	public static void main(String[] args) {
		
		String[] s = {"ritesh" ,"patidar" ,"dffgrtj"};
		int count =0;
		
		for(char a ='a'; a<='z'; a++) {
			for(int i=0;i<=s.length-1; i++) {
				for(int j =0; j<=s[i].length()-1;j++) {
					if(s[i].charAt(j)==a) {
						count++;
					}
				}
			}
			if(count!=0) {
				System.out.println(a + "=" + count);
				count=0;
			}
		}
		
	}
}
