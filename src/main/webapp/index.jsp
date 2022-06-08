<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

<h3>Welcome ${user.custid}</h3>

<h3><a href="<c:url value="/secure/login.jsp" />">Login</a></h3>
<h3><a href="<c:url value="/pages/register/registerForm.jsp" />">MembersForm</a></h3>

<h3><a href="<c:url value="/EndProject/KevinProductInfo.html" />">KevinProductInfo1.html</a></h3>
<h3><a href="<c:url value="/EndProject/KevinProductInfo2.html" />">KevinProductInfo2.html</a></h3>
<h3><a href="<c:url value="/EndProject/KevinProductInfo3.html" />">KevinProductInfo3.html</a></h3>
<h3><a href="<c:url value="/EndProject/KevinProductInfo4.html" />">KevinProductInfo4.html</a></h3>
<h3><a href="<c:url value="/EndProject/KevinNewCart.html" />">KevinNewCart</a></h3>
</body>
</html>