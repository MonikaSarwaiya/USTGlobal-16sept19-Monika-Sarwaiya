package com.ustglobal.userinfo;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.user_info.bean.UserBean;
import com.ustglobal.user_info.dao.UserDAO;
import com.ustglobal.user_info.util.UserInfoManager;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to List All Contacts");
		System.out.println("press 2 to search for a Contact");
		System.out.println("press 3 to Operate on Contact");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 2:
			UserDAO  dao = UserInfoManager.getUserDAO();
			String name = sc.next();
			UserBean bean1 = dao.searchByName(name);

			if(bean1!=null) {
				System.out.println("Name : " + bean1.getName());
				System.out.println("Id : " + bean1.getNumber());
				System.out.println("Salary - " + bean1.getGroupName());
			}else {
				System.out.println("no data found");
			}
	}
}
}