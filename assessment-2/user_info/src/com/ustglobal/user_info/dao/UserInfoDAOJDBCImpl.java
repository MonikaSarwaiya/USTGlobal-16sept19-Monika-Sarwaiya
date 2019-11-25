package com.ustglobal.user_info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ustglobal.user_info.bean.UserBean;
import com.ustglobal.user_info.dto.UserInfo;

public class UserInfoDAOJDBCImpl implements UserDAO {

	@Override
	public UserBean searchByName(String name) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
		String sql = "select * from ContactFile where name=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				UserBean bean = new UserBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroupName(rs.getString("group_name"));

				return bean;
			}else {
				return null;
			}

			
	}catch(Exception e) {
		e.printStackTrace();
		return null;

	}finally {
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}
}

//	@Override
//	public UserInfo showAllDetails(UserInfo info) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	}
