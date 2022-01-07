<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegSevlet" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname"></td>
			<tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname"></td>
			<tr>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="email"></td>
			<tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="phone"></td>
			<tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="adrs"></td>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Register Now"></td>
			<tr>
		</table>
	</form>
</body>
</html>