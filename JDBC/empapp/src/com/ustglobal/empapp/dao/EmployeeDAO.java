package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	
	public List getAllEmployeeData();

	public EmployeeBean searchEmployeeData(int id);
	
	public int insertEmployeeData(int id, String name, int sal, String gender);
	
	public int updateEmployeeData(int id, String name, int sal, String gender);

	public int deleteEmployeeData(int id);

}