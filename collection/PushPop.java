package com.collection;

import java.util.Iterator;
import java.util.Stack;

public class PushPop {

	public static void main(String[] args) {
		
		Stack s = new Stack() ;
			for(char a='a'; a<'z'; a++ ) {
				s.push(a);
			
			}	System.out.println(s);//push into stack s
	   Stack s1 = new Stack();
	   Object o;
	  for(int i =1 ; i<26; i++) {
		  o = s.pop();
		   
		   s1.push(o);
	   }
	   System.out.println(s1);//pop into stack s1
	   System.out.println(s);//now stack s is empty
	   Iterator i = s1.iterator();
	   
	   while(i.hasNext()) {
		   System.out.print(i.next()+" ");
	   }
			
		
	}

	
}
