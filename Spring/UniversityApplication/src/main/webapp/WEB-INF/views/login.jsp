
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<table>
			<s:form action="/app/login" method="post" commandName="studentLogin">
				<tr>
					<td>User Name</td>
					<td><s:input type="text" path="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><s:input type="password" path="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</s:form>
		</table>

	</div>
	
	<div style="color: red">${error}</div>
</body>
</html>