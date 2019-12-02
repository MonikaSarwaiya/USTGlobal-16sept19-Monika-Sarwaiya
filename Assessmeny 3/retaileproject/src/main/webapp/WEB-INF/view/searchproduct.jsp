<%@page import="com.ustglobal.retaileproject.bean.Product"%>
<%@page import="com.ustglobal.retaileproject.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset style:"margin-top=500px;"> 
<form action="./search" method="post"">
<input type="text" name="pname" placeholder="enter product name">
<button type="submit" style="color: blue;margin-top: 20px;">search</button>
</form>

<%Product product=(Product)request.getAttribute("product"); %>
<%if(product!=null){ %>
<table style:"margin-top="500px;" border=1px;">
<tr>
<th>PID</th>
<th>Name</th>
<th>Price</th>
<th>Buy</th>
</tr>
<tr>
<td><%=product.getPid() %></td>
<td><%=product.getPname() %></td>
<td><%=product.getPrice() %></td>
<td><a href="./buy">buy</a></td>
</tr>
</table>

<%} %>
</fieldset>
</body>
</html>