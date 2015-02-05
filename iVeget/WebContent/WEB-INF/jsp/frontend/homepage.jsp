<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="background-color: green;">
	<h1>Chào ${sessionScope.username}!</h1>
	<a href="${pageContext.request.contextPath}/LoginController/logout.fpt">Logout</a>
</div>