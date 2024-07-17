package com.collection.hashCode;

public class EmpTest {

	public static void main(String[] args) {
		
		Emp e = new Emp("ritesh" ,"Patidar");
		Emp e1 = new Emp("ritesh", "Patidar");
		
		if(e.equals(e1)) {
			if(e.hashCode()==e1.hashCode()) {
			System.out.println("both Object is Same");
		}else {
			System.out.println("Not Same");
		}
		}else {
		System.out.println("both object no equal");
	}
}
}
