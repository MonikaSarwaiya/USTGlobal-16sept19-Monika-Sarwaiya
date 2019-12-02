package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetailsServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PrintWriter out = resp.getWriter();

		String sql = "Select * from employee_info where id = ?";
		String url = "jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root";
		String empId = req.getParameter("text");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empId);
			rs = pstmt.executeQuery();

			out.println("<table border=4>");
			out.println("<thead>");
			out.println("<th> id </th>");
			out.println("<th> name </th>");
			out.println("<th> salary </th>");
			out.println("<th> gender </th>");
			out.println("</thead>");

			if(rs.next()) {

				out.println("<tbody>");
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt(1));
				out.println("</td>");

				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");

				out.println("<td>");
				out.println(rs.getInt(3));
				out.println("</td>");

				out.println("<td>");
				out.println(rs.getString(4));
				out.println("</td>");
				
				out.println("</tr>");
				out.println("</tbody>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} if(pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					} if(con != null) {
						try {
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
