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
<h3><a href="<c:url value="/EndProject/ProductInfo1.jsp" />">ProductInfo1</a></h3>
<h3><a href="<c:url value="/EndProject/ProductInfo2.jsp" />">ProductInfo2</a></h3>
<h3><a href="<c:url value="/EndProject/ProductInfo3.jsp" />">ProductInfo3</a></h3>
<h3><a href="<c:url value="/EndProject/ProductInfo4.jsp" />">ProductInfo4</a></h3>
<h3><a href="<c:url value="/EndProject/NewCart.jsp" />">NewCart</a></h3>

<h3><a href="<c:url value="/EndProject/KevinProductInfo.html" />">KevinProductInfo</a></h3>
<h3><a href="<c:url value="/EndProject/KevinNewCart.html" />">KevinNewCart</a></h3>
</body>
</html>