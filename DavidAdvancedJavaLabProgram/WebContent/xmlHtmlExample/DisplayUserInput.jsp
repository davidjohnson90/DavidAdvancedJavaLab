<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="DisplayUserInput.jsp" method="GET">
		First Name : <input type="text" name="firstname" /> Last Name : <input
			type="text" name="lastname" /> <input type="submit" value="Submit" />
	</form>
	<%
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		if (fname != null && lname != null) {
			PrintWriter pw = response.getWriter();
			pw.print("First Name : " + fname + " and Last Name : " + lname);
		}
	%>
</body>
</html>