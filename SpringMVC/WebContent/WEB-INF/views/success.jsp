<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>成功啦</h1>
	
	<h2>${requestScope.user}</h2>
	
	
	<h2> ${requestScope.names}</h2>
	
	
	<h2>SessionAttribute:${sessionScope.users}</h2>
	
	
	<fm:message key="i18n.username"></fm:message>
	<br>
	<fm:message key="i18n.username"></fm:message>
</body>
</html>