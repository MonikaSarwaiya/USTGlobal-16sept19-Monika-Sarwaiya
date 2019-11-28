package com.ustglobal.collectionframework.list;

public class Teacher {

	int id;
	String name;
	String dept;
	
	public Teacher(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
