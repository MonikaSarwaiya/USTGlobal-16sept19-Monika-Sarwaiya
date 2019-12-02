package com.ustglobal.empwebapp.dto;

import lombok.Data; //lombok is a framework

@Data // This will give us all getters and setters method along with equals,hashcode,toString methods
public class EmployeeInfo {

	private int id;
	private String name;
	private String email;
	private String password;

}
