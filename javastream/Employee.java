package com.javastream;

public class Employee {
	 public String name;
	 public double salary;
	 Employee(String n,double s)
	 {
		this.name=n;
		this.salary=s;
	 }
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public double getSalary() {
		return salary;
	}
	/*
	 * public void setSalary(double salary) { this.salary = salary; }
	 */
}