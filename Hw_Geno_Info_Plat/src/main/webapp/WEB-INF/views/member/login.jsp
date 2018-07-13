<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>로그인</h2>
		<form action="${pageContext.request.contextPath}/member/login" method="post">
			아이디:<input type="text" name="mId"><br>
			비번:	<input type="password" name="mPw"><br>
			<button type="submit">로그인</button>	
		</form>
	</div>
</body>
</html>