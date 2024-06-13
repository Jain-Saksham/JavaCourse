package com.sakshamjain24.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Ranga", 97, 98, 100);
		Student student1 = new Student("Ranga", 60, 70, 97, 98, 100);
		Student student2 = new Student("Ranga", 97, 100);

		int number = student.getNumberOfMarkes();
		System.out.println("length " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("maximumMark " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("minimumMark " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("average " + average);

//		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(2);
		System.out.println(student);

	}

}
