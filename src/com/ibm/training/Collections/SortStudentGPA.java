package com.ibm.training.Collections;

import java.util.Comparator;

public class SortStudentGPA implements Comparator<Student> {
	
	public int compare(Student s1 ,Student s2){
		String gpa1 = String.valueOf(s1.getGPA());
		String gpa2 = String.valueOf(s2.getGPA());
		
		int result = gpa1.compareTo(gpa2);
//		int result = s1.getName().compareTo(s2.getName());
		if (result != 0){return result;}
		else {return 0;}
		//return 0;
	}
}
