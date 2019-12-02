package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {

		case 1 : 
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				System.out.println("Name : "+  bean.getName());
				System.out.println("Id : "+ bean.getId());
				System.out.println("Gender : "+ bean.getGender());
				System.out.println("Salary : "+ bean.getSal());
			}
			
		 	break;  
			
		case 2 : 
			EmployeeDAO dao1 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter the Data");
			System.out.println("Enter the id : ");
			int insertId = sc.nextInt();
			
			System.out.println("Enter the name");
			String insertName = sc.next();
			
			System.out.println("Enter the salary");
			int insertSal = sc.nextInt();
			
			System.out.println("Enter the gender");
			String insertGender = sc.next();
			
			dao1.insertEmployeeData(insertId, insertName, insertSal, insertGender);
			
			break;

		case 3 : 
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter the Data");
			System.out.println("Enter the id : ");
			int updateId = sc.nextInt();
			
			System.out.println("Enter the name");
			String updateName = sc.next();
			
			System.out.println("Enter the salary");
			int updateSal = sc.nextInt();
			
			System.out.println("Enter the gender");
			String updateGender = sc.next();
			
			dao2.updateEmployeeData(updateId, updateName, updateSal, updateGender);
			break;
			
		case 4 : 
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter the Data");
			System.out.println("Enter the id : ");
			int deleteId = sc.nextInt();
			
			dao3.deleteEmployeeData(deleteId);
			break;
			
		case 5 :
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			int id = sc.nextInt();
			EmployeeBean bean = dao4.searchEmployeeData(id);
			if(bean != null) {
				System.out.println("Name : "+  bean.getName());
				System.out.println("Id : "+ bean.getId());
				System.out.println("Gender : "+ bean.getGender());
				System.out.println("Salary : "+ bean.getSal());
			} else {
				System.out.println("No Data Found");
			}
			break;
		}


	}
}


