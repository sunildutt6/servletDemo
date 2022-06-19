<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee description</title>
</head>
<body>

<jsp:useBean id="Employee"  class="com.sunil.employeedetails.Employee">
<jsp:setProperty name="Employee" property="*" />
</jsp:useBean>

Employee details

<br/>Employee Id:<jsp:getProperty property="id" name="Employee"/>
<br/>Employee First Name:<jsp:getProperty property="firstname" name="Employee"/>
<br/>Employee Last Name:<jsp:getProperty property="lastname" name="Employee"/>
<br/>Employee Salary:<jsp:getProperty property="salary" name="Employee"/>

</body>
</html>