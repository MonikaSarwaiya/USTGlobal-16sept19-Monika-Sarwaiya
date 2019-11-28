package com.ustglobal.java8features;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5, "Deepesh", 56.7));
		al.add(new Student(2, "Deepu", 86.7));
		al.add(new Student(6, "DK", 60.7));
		al.add(new Student(4, "Dev", 69.7));
		al.add(new Student(1, "Virat", 36.7));

		HelperClass hc = new HelperClass();
//		hc.displayAllStudents(al);
//		hc.displayFailedStudents(al);
		hc.displayPassedStudents(al);
		hc.displayTopperStudent(al);
	}

}
