package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double perc;

	public Student(int id, String name, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
	}

	/*
	 * @Override public int compareTo(Student s) { if(this.id > s.id) {
	 * 
	 * return 1; } else if(this.id < s.id) {
	 * 
	 * return -1; } else {
	 * 
	 * return 0;
	 * 
	 * } }
	 */

	/*
	 * @Override public int compareTo(Student s) { if(this.perc > s.perc) {
	 * 
	 * return 1; } else if(this.perc < s.perc) {
	 * 
	 * return -1; } else {
	 * 
	 * return 0;
	 * 
	 * } }
	 */

	/*
	 * @Override public int compareTo(Student s) { String p = this.name; String q =
	 * s.name;
	 * 
	 * //return p.compareToIgnoreCase(q); p.toUpperCase(); q.toUpperCase();
	 * 
	 * return p.compareTo(q);
	 * 
	 * }
	 */

	@Override
	public int compareTo(Student s) {
		
		Integer i = this.id;
		Integer j = s.id;
		
		return i.compareTo(j);
		
		/*
		 * int i = this.id; int j = s.id; //Invalid don't do this
		 */	}
}
