package com.javastream;



import java.util.Random;
import java.util.stream.Stream;

public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		Stream<Double>results=Stream.generate(Math::random);
		results.limit(3).forEach(e->System.out.println(e));

		
	
	}

}

