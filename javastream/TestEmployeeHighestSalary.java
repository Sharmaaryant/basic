package com.javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployeeHighestSalary {

	public static void main(String[] args) {
	
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Ritesh", 20000));
		emp.add(new Employee("Ram", 25000));
		emp.add(new Employee("Shayam", 200000));
		emp.add(new Employee("Ramu", 10000));
		emp.add(new Employee("Kalu", 52000));
		emp.add(new Employee("Devta", 2000));
		
	 emp.stream().filter(e-> e.getSalary()>2000).collect(Collectors.toList()).forEach(e-> System.out.println(e.getName()+ " " +e.getSalary()));;
		
		
}
}