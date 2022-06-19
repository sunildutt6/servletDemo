<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication</title>
</head>
<body>

	<%
	double n1 = Double.parseDouble(request.getParameter("number1"));
	double n2 = Double.parseDouble(request.getParameter("number2"));
	%>

	Multiplication of
	<%=n1%>
	and
	<%=n2%>
	is =
	<%=n1 * n2%>
</body>
</html>