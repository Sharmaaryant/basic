package com.collection.comparators;

import java.util.Comparator;

public class ComparatorExam  {

	public String fName;
	public String lName;
	public int id;
	
	public ComparatorExam(String fName,String lName, int id) {
		this.fName =fName;
		this.lName=lName;
		this.id= id;
		
	}
	
	public String toString() {
		return fName +" "+lName+" " + id;
	}
	
	
}
