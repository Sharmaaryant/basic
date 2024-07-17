package com.collection.hashCode;

public class Emp {

	public String fName;
	public String lName;
	
	public Emp(String name ,String lName) {
		this.fName=name;
		this.lName=lName;
	}
	
	public boolean equals(Emp a) {
		
		return this.fName==a.fName;
	}
	
	public String toString() {
		return fName +" " +lName;
	}
	
	@Override
	public int hashCode() {
		return this.fName.hashCode()+lName.hashCode();
	}
}
