package com.collection.comparators;


import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i<i2) 
		
			return +1;
		
		else if(i>i2)
			
		
		return -1;
		else 
			return 0;
		
	}

}
