package com.javastream;




import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1>em=new ArrayList<>();
		em.add(new Employee1("ab",101));
		em.add(new Employee1("abc",121));
		em.add(new Employee1("abcd",102));
		em.add(new Employee1("aa",103));
		em.add(new Employee1("abb",105));
		List<Employee1> list=em.stream().sorted(Comparator.comparingInt(Employee1::getDepartmentId))
                .collect(Collectors.toCollection(ArrayList::new));

        list.forEach( e -> System.out.println(e.getName() + " - Salary: " + e.getDepartmentId()));
	}
}
