<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>�α��� ���</title>
</head>
<body>
	<h1>�α��� ���</h1>
	id : ${id}
	<br> password : ${pw}
	<br>

	<hr>
	id : ${login.id}
	<br> password : ${login.pw}
	<br>
	<hr>
</body>
</html>
