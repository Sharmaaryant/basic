package com.javastream;

public class Employee1 {
	public String name;
	public int departmentId;
	Employee1(String n,int d)
	{
		this.name=n;
		this.departmentId=d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
}