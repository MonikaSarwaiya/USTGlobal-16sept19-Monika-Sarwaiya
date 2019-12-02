package com.ustglobal.empapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List getAllEmployeeData() {

		String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);

			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while(rs.next()) {

				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);

				result.add(bean);
			}
			return result;

		} catch(Exception e) {

			e.printStackTrace();
			return null;
		} finally {

			try {

				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}

			} catch(Exception e) {

				e.printStackTrace();
			}
		}
	}

	public EmployeeBean searchEmployeeData(int id) {

		String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);

			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				
				return bean;
			} else {
				return null;
			}
		} catch(Exception e) {

			e.printStackTrace();
			return null;
			
		} finally {

			try {

				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}

			} catch(Exception e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public int insertEmployeeData(int id, String name, int sal, String gender) {
		String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			
			// Step 1 : Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get the connection
			con = DriverManager.getConnection(url);

			// Step 3 : Issue SQL Query
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal);
			pstmt.setString(4, gender); 
			
			int count = pstmt.executeUpdate();
			
			// Step 4 : Read the Result
			System.out.println(count + " Row(s) Inserted");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Step 5 : Close all JDBC Object 
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int updateEmployeeData(int id, String name, int sal, String gender) {

		String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root";
		String sql = "update employee_info set name = ?, sal = ?, gender = ? where id = ?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			
			// Step 1 : Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get the connection
			con = DriverManager.getConnection(url);

			// Step 3 : Issue SQL Query
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender); 
			
			int count = pstmt.executeUpdate();
			
			// Step 4 : Read the Result
			System.out.println(count + " Row(s) Updated");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Step 5 : Close all JDBC Object 
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int deleteEmployeeData(int id) {
		
		String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root";
		String sql = "delete from employee_info where id = ?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			
			// Step 1 : Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get the connection
			con = DriverManager.getConnection(url);

			// Step 3 : Issue SQL Query
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id); 
			
			int count = pstmt.executeUpdate();
						
			// Step 4 : Read the Result
			System.out.println(count + " Row(s) deleted");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Step 5 : Close all JDBC Object 
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
