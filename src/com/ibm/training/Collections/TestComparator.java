package com.ibm.training.Collections;

import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestComparator {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>(3);
		Comparator<Student> sortName = new SortStudentName();
		Comparator<Student> sortGPA = new SortStudentGPA();
		
		studentList.add(new Student("Thomas Jefferson", 1111, 3.8));
		studentList.add(new Student("John Adams", 2222, 3.9));
		studentList.add(new Student("George Washington", 3333, 3.4));
		
		Collections.sort(studentList, sortName);
		System.out.println("---Student sorted by Name---");
		for(Student student : studentList){
			System.out.println(student);
		}
		
		Collections.sort(studentList, sortGPA);
		System.out.println("\n---Student sorted by GPA---");
		for(Student student : studentList){
			System.out.println(student);
		}
	}

}
