<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login Failed</title>
</head>
<body>
<%
String msg=(String)request.getAttribute("msg");
%>
<h2>Invalid Credentials,<%=msg %></h2>
<%@ include file="CustomerLogin.html" %>


</body>
</html>