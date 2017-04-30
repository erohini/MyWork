<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration System</title>
</head>
<body>
<form action="ObtainDetailsPath" method="post">
OBTAIN DETAILS...<br>
First Name:<input type="text" name="firstName"><br><br>
Last Name:<input type="text" name="lastName"><br><br>
<input type="submit" value="Submit">
</form>



<form action="EnterStudentDetailsPath" method="post">
ENTER DETAILS...<br>
Last Name:<input type="text" name="lastName"><br><br>
First Name:<input type="text" name="firstName"><br><br>
Middle Name:<input type="text" name="middleName"><br><br>
<input type="radio" name="Gender" value="male">Male</input>
<input type="radio" name="Gender" value="female">Female</input><br><br>

<select name=Major>
	<option value="computer_science">Computer Science</option>
	<option value="mathematics">Mathematics</option>
	<option value="english">English</option>
	<option value="chinese">Chinese</option>
</select><br><br>

<select name=Minor multiple size=2>
	<option value="computer_science">Computer Science</option>
	<option value="mathematics">Mathematics</option>
	<option value="english">English</option>
	<option value="chinese">Chinese</option>
</select><br><br>

Hobby: <input type="checkbox" name="Hobby" value="tennis">Tennis<br>
		<input type="checkbox" name="Hobby" value="golf">Golf<br>
		<input type="checkbox" name="Hobby" value="ping_pong">Ping Pong<br><br>
		
Remarks: <input type="text" name="remarks"><br><br>

<input type="submit" value="Submit">

 </form>

</body>
</html>