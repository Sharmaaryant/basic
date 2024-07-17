package com.basic;

public class AverageSumEvenOdd {

	public static void main(String[] args) {
		int n =10;
		int odd=0 ,osum =0;
		int even=0,esum =0;
		
		for(int i = 1; i<=n; i++) {
			if(i%2==0) {
				esum =esum +i;
				even++;
			}else {
				osum = osum + i;
				odd++;
			}
		}System.out.println("sum of even no :" + esum);
		System.out.println("sum of odd no :" + osum);
		System.out.println("avg of even no :" + esum/even);
		System.out.println("avg of odd no :" + osum/odd);
		
	}
}
