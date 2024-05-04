<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUpload</title>
</head>
<body>
	<form action="FileUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="file1" required="required">
		<input type="file" name="file2" required="required">
		<input type="submit">
	</form>
</body>
</html>