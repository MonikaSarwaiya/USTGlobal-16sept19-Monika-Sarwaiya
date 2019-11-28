package com.ustglobal.beanobject.bean;

public class TestEmp {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(5);
		e.setName("DK");
		e.setSalary(53000.50);
		e.setDept("Development");
		e.setDesignation("Software Developer");
		
		DataBaseEmp dbe = new DataBaseEmp();
		dbe.receive(e);
	}
}
