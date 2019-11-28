package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(5);
		s.setName("DK");
		s.setRollNo(53);
		
		DataBase db = new DataBase();
		db.receive(s);
	}
}
