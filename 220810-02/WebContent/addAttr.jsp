<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("name1", "value1");
	request.setAttribute("name2", 2);
	application.setAttribute("name3", 3.33);

	request.setAttribute("name4", "req4");
	application.setAttribute("name4", "app4");
	
	request.getRequestDispatcher("getAttr.jsp")
	.forward(request,response);

%>
</body>
</html>