package com.ustglobal.user_info.util;

import com.ustglobal.user_info.dao.UserDAO;
import com.ustglobal.user_info.dao.UserInfoDAOJDBCImpl;
import com.ustglobal.user_info.dto.UserInfo;

public class UserInfoManager {

	private UserInfoManager() {}

	public static UserDAO getUserDAO(){
		return new UserInfoDAOJDBCImpl();
	}
}
