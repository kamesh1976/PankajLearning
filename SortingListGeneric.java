package com.cpu.performance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListGeneric {
	public static void main(String args[]) {
		Student st1 = new Student(11, "pankaj");
		Student st2 = new Student(13, "Kumar");
		Student st3 = new Student(15, "pandey");
		Student st4 = new Student(12, "Kamesh");
		Student st5 = new Student(14, "Java");

		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		System.out.println(list);

		System.out.println("Sorting By SID");
		Collections.sort(list, new StudentIdComparator());
		System.out.println("Sorted list SID: ");
		for (Object a : list) {
			System.out.println(a);
		}
		Collections.sort(list, new StudentNameComparator());
		System.out.println("Sorted list SNAME: ");
		for (Object b : list) {
			System.out.println(b);
		}
	}

}

class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1 == null && student2 == null)
			return 0;
		if (student1 instanceof Student && student2 instanceof Student) {
			return student1.studentId - student2.studentId;
		}
		return 0;
	}
}

class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1 == null && student2 == null)
			return 0;
		if (student1 instanceof Student && student2 instanceof Student) {
			return student1.getStudentName().compareTo(student2.studentName);
		}
		return 0;
	}
}

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {

		return "Sid: " + this.studentName + "-- Sname: " + this.studentName;
	}
}
