<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소셜 로그인</title>
<link rel="stylesheet" href="/resources/css/home.css">
</head>
<body>
	<div id="wrap">
		<c:choose>
			<c:when test="${not empty sessionScope.loginUser}">
				<h2>${sessionScope.loginUser.username}님,안녕하세요!
					${sessionScope.loginUser.oauthtype}로 로그인하셨습니다.</h2>
			</c:when>

			<c:otherwise>
				<h2>로그인 후 이용해주세요. 😊</h2>
			</c:otherwise>
		</c:choose>

		<div class="first_image">
			<img src="/resources/images/banner.jpg" alt="welcome">
		</div>
		<div class="second_image">
			<img src="/resources/images/google_char.jpg" alt="welcome">
			<img src="/resources/images/google_char.jpg" alt="welcome">
			<img src="/resources/images/google_char.jpg" alt="welcome">
			<img src="/resources/images/google_char.jpg" alt="welcome">
			<img src="/resources/images/google_char.jpg" alt="welcome">
			<img src="/resources/images/google_char.jpg" alt="welcome">
			<img src="/resources/images/google_char.jpg" alt="welcome">
		</div>


		<c:if test="${not empty sessionScope.loginUser}">
			<a href="social/logout">로그아웃</a>
			<a href="/">게시판가기</a>
		</c:if>

		<c:if test="${empty sessionScope.loginUser}">
			<a href="social/loginPage">로그인</a>
		</c:if>
	</div>

</body>
</html>