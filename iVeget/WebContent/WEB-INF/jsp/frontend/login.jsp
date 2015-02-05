<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<div style="background-color: green;">
	<spring:form method="post" commandName="userEntity" action="login.fpt">
		Username: <spring:input path="username" />
		<br>
		Password: <spring:input path="password" />
		<br>
		<input type="submit" value="Login">
	</spring:form>
	<c:out value="${message}"></c:out>
</div>