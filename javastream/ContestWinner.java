package com.javastream;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ContestWinner {

	public static void main(String[] args) {
	ArrayList<Constant> list = new ArrayList();
	
	list.add(new Constant("Ritesh" ,"5874563210"));
	list.add(new Constant("Shaym" ,"7884563210"));
	list.add(new Constant("Shubham" ,"9899063210"));
	list.add(new Constant("Aryant" ,"9874563222"));
	list.add(new Constant("yuvi" ,"9874563233"));
	list.add(new Constant("Ram" ,"9874563275"));
	
	list.stream().map(e-> e.phone).filter(e-> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
		Collections.shuffle(e);
		return e.stream();
	})).limit(3).forEach(e->System.out.println(e) );
	
	
	
	}
	}

