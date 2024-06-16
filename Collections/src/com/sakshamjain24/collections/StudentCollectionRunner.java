package com.sakshamjain24.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class StudentCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Saksham"), new Student(100, "Vashu"), new Student(3, "Aman"));

		List<Student> studentsAL = new ArrayList<Student>(students);

		System.out.println(studentsAL);

		Collections.sort(studentsAL);
		System.out.println("Asc" + studentsAL);

		Collections.sort(studentsAL, new DescendingStudentComparator());
		System.out.println("Desc" + studentsAL);
	}
}
