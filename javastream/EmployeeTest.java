package com.javastream;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("sapna", 25000));
		list.add(new Employee("Siya", 55000));
		list.add(new Employee("Riya", 50000));
		list.add(new Employee("PArul", 30000));
		list.add(new Employee("Aarya", 40000));
		list.add(new Employee("sona", 80000));
		
		double hs = list.stream().map(Employee :: getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(hs);
	}
}
