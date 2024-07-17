package com.collection.comparable;

public class ComparableExam implements Comparable<ComparableExam> {

	public String name;
	public int age;
	
	public ComparableExam(String name ,int age) {
		this.name =name;
		this.age = age;
	}
	
	public int compareTo(ComparableExam c) {
		//int i = this.name.compareTo(c.name);
		int i = this.age - c.age;
		return i;
	}
	
	public String toString() {
		return name + " " + age;
		
	}
}
