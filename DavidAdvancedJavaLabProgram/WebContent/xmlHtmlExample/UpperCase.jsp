<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change to upper case</title>
</head>
<body>
	<jsp:useBean id="myuppercase"
		class="com.david.servlet.UpperCaseConverter" />
	<%
		String s = request.getParameter("text1");
		String uppertxt = myuppercase.convertToUpperCase(s);
		out.println("converted text = " + uppertxt);
	%>
</body>
</html>