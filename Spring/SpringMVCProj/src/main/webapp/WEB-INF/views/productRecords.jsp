<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Product Record</h2>
	
	<table align="center">
	<c:forEach items="${products}" var="product">
	
	Product id: $(product.id)
	<br> Productname: $(product.name)
	<br> ProductPrice: $(product.price)
	<br> ProductDesc: $(product.description)
	<br></c:forEach>
</table>
</body>
</html>