
<%@page import="com.ustglobal.retaileproject.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
User bean =(User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<h3>${msg} </h3>
	<a href="./changepassword">Change Password</a>
	<a href="./order">ordered item</a>
	<a href="./search">Search Product</a>
	<a href="./logout">Logout</a>
	<h2 style="font-size:40px;color: red;">Welcome <%=bean.getName()%></h2>

<h3 style="color: red;">${msg}</h3>
</fieldset>
</body>
</html>