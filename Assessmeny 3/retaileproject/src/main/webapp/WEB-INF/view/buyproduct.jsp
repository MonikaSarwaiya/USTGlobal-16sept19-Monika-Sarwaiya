<%@page import="com.ustglobal.retaileproject.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
<a href="./logout">Logout</a>
<fieldset>
<form action="./buy" method="post" style="margin-left: 100px;">
<%Product product=(Product)request.getAttribute("product"); %>
<table>
<tr>
<th>Pname</th>
<th>Price</th>
<th>Quantity</th>
<th>buy</th>
</tr>
<tr>
<td><%=product.getPname() %></td>
<td><%=product.getPrice() %></td>
<td><input type="number" name="quantity"></td>
<td><button type="submit">Buy</button></td>
</tr>
</table>
</form>
</fieldset>
</body>
</html>