<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<html>
<head>
<title>로그인</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="result4" method="post">
		<label>id<input type="text" id="id" name="id" /></label><br> <label>pw<input
			type="password" id="pw" name="pw" /></label><br> <input class=""
			type="submit">버튼
	</form>
	<P></P>
</body>
</html>
