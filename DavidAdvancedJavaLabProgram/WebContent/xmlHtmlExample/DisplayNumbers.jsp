<%@ page language="java" contentType="text/html; charset=ISO-8859-
1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//
EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scripting demo page</title>
</head>
<body>
	<%--declaration tag --%>
	<%!int i = 10;%>
	<%--scriptlet tag --%>
	<%
		out.print("i=" + i);
	%>
	<br>
	<br>
	<%
		out.print("for loop execution start... <br>");
	%>
	<br>
	<%
		for (int j = 1; j <= 10; j++) {
			out.print("j=" + j + "<br>");
		}
	%>
	<br>
	<%
		out.print("for loop execution complete...");
	%>
	<br>
	<br>
	<%--expression tag --%>
	<%!int a = 10;
	int b = 20;%>
	the addition of two variables a and b is 10 + 20 =
	<%=a + b%>
	<br>
	<br> current time:<%=new java.util.Date()%>
</body>
</html>