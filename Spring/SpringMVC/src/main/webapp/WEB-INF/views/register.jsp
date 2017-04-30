<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
		<div align="center">
		<h1>Register Student</h1>
			<table>
			<s:form commandName="studentData" action="registerProcess" method="post">
			<tr>
					<td>ID: </td>
					<td><s:input path="id" /></td>
					<td><s:errors path="id" cssStyle="color:red;"/></td>
				</tr>
				<tr>
					<td>Name: </td>
					<td><s:input path="name" /></td>
					<td><s:errors path="name" cssStyle="color:red;"/></td>
				</tr>
				<tr>
					<td>email: </td>
					<td><s:input path="email" /></td>
					<td><s:errors path="email" cssStyle="color:red;"/></td>
				</tr>
				<tr>
					<td>Password </td>
					<td><s:input path="password" /></td>
					<td><s:errors path="password" cssStyle="color:red;"/></td>
				</tr>
				<tr>
					<td>Confirm Password </td>
					<td><s:input path="confirm_password" /></td>
					<td><s:errors path="confirm_password" cssStyle="color:red;"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="REGISTER" /></td>
				</tr>
				</s:form>
			</table>
		</div>
	
</body>
</html>