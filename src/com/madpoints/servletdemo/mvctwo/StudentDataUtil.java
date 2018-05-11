package com.madpoints.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
	
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("James", "Richt", "jr22@email.com"));
		students.add(new Student("Kelly", "Lou", "kl86@email.com"));
		students.add(new Student("Lin", "Howe", "lh77@email.com"));
		
		// return the list
		return students;
	}
}
