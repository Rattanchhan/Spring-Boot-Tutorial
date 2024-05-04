<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- <%
		int result= (int)session.getAttribute("result");
		out.println("Resutl : " + result);
	%> --%>
	
	<%
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/ServletJDBC";
		String username="postgres";
		String password="R@atana@2992000";
		String query = "select * from tbjdbc where id =1";
		
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url,username,password);
		Statement st= connection.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		rs.next();
	%>
	
		Name: <%=rs.getString(2)%><br>
		Gender : <%=rs.getString(3) %>
</body>
</html>