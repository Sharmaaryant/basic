package com.collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShortByName implements Comparator<ComparatorExam> {

	public int compare(ComparatorExam e, ComparatorExam e1) {

		if(e.fName.equals(e1.fName)) {
			if(e.lName.equals(e1.lName)) {
				return e.id-e1.id;
			}else {
				return e.lName.compareTo(e1.lName);
			}
		}
		
		
		return e.fName.compareTo(e1.fName);
	}
		}

