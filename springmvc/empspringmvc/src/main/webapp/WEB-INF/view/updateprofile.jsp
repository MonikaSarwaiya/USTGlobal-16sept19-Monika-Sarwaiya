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
		<legend>Update Profile</legend>
		<form action="./updateprofile" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><select name="gender" required="required">
							<option>-----Select-----</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Doj:</td>
					<td><input type="date" name="Doj"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>