package com.ustglobal.arrays;

public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student(1, "Deepesh", 86.20);
		Student s1 = new Student(2, "DK", 86.17);
		Student s2 = new Student(3, "Deepu", 82.90);

		Student[] students = new Student[3];

		students[0] = s;
		students[1] = s1;
		students[2] = s2;

		for(Student st : students) {
			System.out.println(st);
		}
		receive(students);
	}

	 static void receive(Student[] students) {
		 for(Student s : students) {
			 System.out.println(s);
		 }
		
	}

	}


