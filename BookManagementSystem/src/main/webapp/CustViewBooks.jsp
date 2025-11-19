<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.libraryManagement.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Books</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #acb6e5);
        padding: 40px;
    }
    h2 {
        text-align: center;
        color: #333;
    }
    table {
        width: 80%;
        margin: auto;
        border-collapse: collapse;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        background-color: white;
    }
    th, td {
        padding: 12px 20px;
        text-align: center;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #007bff;
        color: white;
    }
    tr:hover {
        background-color: #f1f1f1;
    }
    .container {
        max-width: 1000px;
        margin: auto;
    }

    /* Buy Button Styling */
    .buy-btn {
        display: inline-block;
        padding: 6px 12px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        font-size: 14px;
        transition: background-color 0.3s ease;
    }
    .buy-btn:hover {
        background-color: #0056b3;
    }

    /* Logout Button Styling */
    .logout-btn {
        display: block;
        width: fit-content;
        margin: 30px auto 0;
        padding: 10px 25px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        font-weight: bold;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }
    .logout-btn:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Available Books</h2>
    <table>
        <tr>
            <th>Book Id</th>
            <th>Book Name</th>
            <th>Author Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Action</th>
        </tr>
        <%
        List<BookBean> bookList = (List<BookBean>) session.getAttribute("list");
        for (BookBean book : bookList) {
        %>
        <tr>
            <td><%= book.getId() %></td>
            <td><%= book.getName() %></td>
            <td><%= book.getAuthorName() %></td>
            <td><%= book.getPrice() %></td>
            <td><%= book.getQuantity() %></td>
            <td>
                <a href="buy?id=<%= book.getId() %>" class="buy-btn">Buy</a>
            </td>
        </tr>
        <% } %>
    </table>

    <!-- Centered Logout Button -->
    <a href="logout" class="logout-btn">Logout</a>
</div>

</body>
</html>
