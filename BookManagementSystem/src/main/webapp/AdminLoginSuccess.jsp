<%@page import="com.nit.libraryManagement.AdminRegBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Successful</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #acb6e5);
        margin: 0;
        padding: 0;
    }

    .container {
        max-width: 600px;
        margin: 100px auto;
        padding: 30px;
        background-color: #ffffff;
        box-shadow: 0 4px 15px rgba(0,0,0,0.1);
        border-radius: 10px;
        text-align: center;
    }

    h2 {
        color: #2c3e50;
        margin-bottom: 30px;
    }

    .button-link {
        display: block;
        width: 250px;
        margin: 10px auto;
        padding: 12px 0;
        text-decoration: none;
        color: white;
        background-color: #007BFF;
        border-radius: 5px;
        font-size: 16px;
        transition: background-color 0.3s ease;
    }

    .button-link:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>

<%
AdminRegBean ab = (AdminRegBean) session.getAttribute("bean");
String name = ab.getName();
%>

<div class="container">
    <h2>Login Success! Welcome <%= name %> </h2>

    <a class="button-link" href="addbook.html">Add Book</a>
    <a class="button-link" href="deletebook.html">Delete Book</a>
	<a class="button-link" href="updatebook.html">Update Book</a>
	<a class="button-link" href="viewallbooks">View All Books</a>


</div>

</body>
</html>
