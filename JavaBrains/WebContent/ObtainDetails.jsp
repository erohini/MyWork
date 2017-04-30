<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Requested Details are Here below...</title>
</head>
<body>
<%String first_name=(String)request.getAttribute("first_name"); 
String last_name=(String)request.getAttribute("last_name");
String middle_name=(String)request.getAttribute("middle_name");
String gender=(String)request.getAttribute("gender");
String major=(String)request.getAttribute("major");
String minor=(String)request.getAttribute("minor");
String hobby=(String)request.getAttribute("hobby");
String remarks=(String)request.getAttribute("remarks");
%>
First Name: <%=first_name %><br>
Last Name: <%=last_name %><br>
Middle Name: <%=middle_name %><br>
Gender: <%=gender %><br>
Major: <%=major %><br>
Minor: <%=minor %><br>
Hobby: <%=hobby %><br>
Remarks: <%=remarks %>
</body>
</html>