<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소셜 로그인</title>
</head>
<body>
	<div>
	<c:if test="${not empty sessionScope.loginUser}">
      ${sessionScope.loginUser.username}님 안녕하세요.
      <br />
		<a href="social/logout">로그아웃</a>
		<a>게시판가기</a>
	</c:if>
	
	<c:if test="${empty sessionScope.loginUser}">
		<a href="social/loginpage">로그인</a>
	</c:if>
		<h1>Hello World!</h1>
		<a href="social/loginpage">로그인하기</a>
	</div>
</body>
</html>