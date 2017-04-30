<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>
<body>

		<div align="center">
		<h1>Login Student</h1>
			<table>
			<s:form commandName="studentData" action="loginProcess" method="post">
				<tr>
					<td>email</td>
					<td><s:input path="email"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><s:input path="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</s:form>
			
			<tr>
			<td></td>
			<td><a
			href="${pageContext.request.contextPath}/student/register">Register</a>
			<a href="${pageContext.request.contextPath}/">Home</a></td>
			</table>

<div></div>
<div>
<p style="color:red;">${failed}</p>
</div>
		</div>
</body>
</html>