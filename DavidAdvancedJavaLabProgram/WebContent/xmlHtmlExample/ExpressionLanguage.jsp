<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	pageContext.setAttribute("pageColor", "yellow");
%>
</head>
<body bgcolor="${pageScope.pageColor}">
	Here are some basic comparisons:
	<p>
		Is 1 less than 2? ${1<2} <br> Does 5 equal 6? ${5==6} <br>
		Is 6 greater than 7? ${6 gt 7}<br>
	<p>
		Now for some math:<br> 6 + 7 = ${6+7}<br> 10 - 7 = ${10-7}<br>
		8 x 9 = ${8*9}<br> 45 / 5 = ${45/5}<br>
</body>
</html>