<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/sivalabs.js"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/frontend/login.css"></c:url>" />
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>

	<h1>
		<tiles:insertAttribute name="header" />
	</h1>

	<tiles:insertAttribute name="body" />

</body>
</html>