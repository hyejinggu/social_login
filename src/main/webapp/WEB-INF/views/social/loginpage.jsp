<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a
		href="https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=vgBxKVvgkklDf2B4NKno&state=1234&redirect_uri=http://localhost:8080/social/nlogin">
		<img src="/resources/images/btnG_완성형.png" alt="naver_login">
	</a>
	<hr>
	<a
		href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=b471328753238fc180284b373832262a&redirect_uri=http://localhost:8080/social/klogin">
		<img src="/resources/images/kakao_login_medium_wide.png" alt="kakao_login">
	</a>

	<hr>

	<a href="https://accounts.google.com/o/oauth2/auth?client_id=654226141377-no0fv2itsjltorg3l19te3aiqv4ilqeu.apps.googleusercontent.com&redirect_uri=http://localhost:8080/social/glogin&response_type=code&scope=email%20profile%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile%20openid&authuser=0&prompt=consent">
		<img src="/resources/images/google_login.png">
	</a>
</body>
</html>