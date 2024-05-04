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
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		if(session.getAttribute("name")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	
	<iframe width="560" height="315" src="https://www.youtube.com/watch?v=OuBUUkQfBYM&t=11941s"></iframe>
	<br>
	<a href="https://www.amazon.com/dp/1633228908?tag=uuid10-20">Amazon</a>
</body>
</html>