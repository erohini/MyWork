
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<div align="center">
	<h2>Register</h2>
		<table>
			<s:form action="/register" method="post" commandName="studentRegister">
				<tr>
					<td>User Name</td>
					<td><s:input type="text" path="userName"/></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><s:input type="text" path="firstName"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><s:input type="text" path="lastName"/></td>
				</tr>
				<tr>
					<td>email</td>
					<td><s:input type="text" path="email"/></td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td><s:input type="password" path="password" /></td>
				</tr>
				
				<tr>
					<td>Confirm Password</td>
					<td><s:input type="password" path="confirmPassword" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
				
			</s:form>
		</table>

	</div>
</body>
</html>