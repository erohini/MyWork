<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Register Form</h2>
	<s:form action="registerProcess" method="post" commandName="register">
		<table>
			<tr>
				<td>UserName</td>
				<td><s:input path="userName" /></td>
			<tr>
				<td>firstName</td>
				<td><s:input path="firstName" /></td>
			<tr>
				<td>lastName</td>
				<td><s:input path="lastName" /></td>
			<tr>
				<td>email</td>
				<td><s:input path="email" /></td>
			<tr>
				<td>city</td>
				<td><s:select items="${cities}" path="city" /></td>
			<tr>
				<td>state</td>
				<td><s:select items="${states}" path="state" /></td>
		</table>

	</s:form>

</body>
</html>