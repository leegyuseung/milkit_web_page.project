<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/staff/home.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<a href="../home.do">홈페이지로 돌아가기</a>
	<h1>관리자 페이지</h1>
	<ul>
		<li><a href="currentOrder.do">주문 현황</a></li>
		<li><a href="usersList.do">회원 관리</a></li>
		<li><a href="product/list.do">상품 리스트</a></li>
	</ul>
</div>

</body>
</html>