package com.javastream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StartsWithT {
public static void main(String[] args) {

	String [] a = {"Ritesh" ,"rit","Rat","Fat","Cat"};
	
	Stream<String> s = Arrays.stream(a);
	s.map(e-> e.toUpperCase()).filter(e-> e.startsWith("R")).distinct().sorted().forEach(e->System.out.println(e));
	
}
}	
