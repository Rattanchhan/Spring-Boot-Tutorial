<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="cout" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jstl DataBase</title>
</head>
<body>
   <%
   %>
   <!-- ---------------------------------usage prefix cout---------------------------------------------- -->
   
   <%-- <cout:forEach items="${students}" var="student">
   		<cout:out value="${student.getId()}"></cout:out><br>
   		<cout:out value="${student.getName()}"></cout:out><br>
   		<cout:out value="${student.getGender()}"></cout:out><br><br>
   </cout:forEach>
   <cout:out value="${name}"></cout:out>
   ${name} --%>
   <!-- ---------------------------------usage prefix sql---------------------------------------------- -->
   
  <%-- <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root" password="K@unthea@04@"></sql:setDataSource>
  <sql:query var="rs" dataSource="${db}">select * from tbstudent</sql:query>
  
  <cout:forEach items="${rs.rows}" var="student">
  		<cout:out value="${student.id}"></cout:out><br>
  		<cout:out value="${student.name}"></cout:out><br>
  		<cout:out value="${student.sex}"></cout:out><br>
  </cout:forEach> --%>
  
  <!-- ---------------------------------usage prefix functions---------------------------------------------- -->
  
  <%-- <cout:set var="str" value="Ratana ready for trianing"></cout:set>
  <cout:forEach items="${function:split(str,' ')}" var="string">
  		<cout:out value="${string}"></cout:out><br>
  </cout:forEach>
  
  index : <cout:out value="${function:indexOf(str,'for')}"></cout:out><br>
  is there : <cout:if test="${function:contains(str,'for')}">
  	<cout:out value="you are right Cambodia"></cout:out>
  </cout:if> --%>
  
</body>
</html>