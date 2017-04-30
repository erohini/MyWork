<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello Welcome to Student Registration
</h1>

<P>
<a href="<%=request.getContextPath()%>/login">Login</a>
<a href="<%=request.getContextPath()%>/register">Register</a>
</P>
</body>
</html>
