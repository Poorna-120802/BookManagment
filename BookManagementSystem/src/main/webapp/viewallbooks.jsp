<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="com.nit.libraryManagement.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Books</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
        margin: 0;
        padding: 20px;
    }
    h1 {
        text-align: center;
        color: #333;
    }
    table {
        margin: 0 auto;
        width: 90%;
        border-collapse: collapse;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    th, td {
        padding: 12px 15px;
        border: 1px solid #ddd;
        text-align: center;
    }
    th {
        background-color: #007BFF;
        color: white;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9;
    }
    .no-books {
        text-align: center;
        font-size: 18px;
        color: #555;
        margin-top: 50px;
    }
</style>
</head>
<body>

<h1>All Available Books</h1>

<%
ArrayList<BookBean> list = (ArrayList<BookBean>) request.getAttribute("list");
if (list != null && !list.isEmpty()) {
%>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Author</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
<%
    for (BookBean bb : list) {
%>
    <tr>
        <td><%= bb.getId() %></td>
        <td><%= bb.getName() %></td>
        <td><%= bb.getAuthorName() %></td>
        <td><%= bb.getPrice() %></td>
        <td><%= bb.getQuantity() %></td>
    </tr>
<%
    }
%>
</table>
<%
} else {
%>
    <div class="no-books">No Books Available</div>
<%
}
%>

</body>
</html>
