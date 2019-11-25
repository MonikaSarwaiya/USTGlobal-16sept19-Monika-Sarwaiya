package com.ustglobal.user_info.dao;

import java.util.List;

import com.ustglobal.user_info.bean.UserBean;

public interface UserDAO {

	public UserBean searchByName(String name);
	
//	public  List showAllDetails();
}
