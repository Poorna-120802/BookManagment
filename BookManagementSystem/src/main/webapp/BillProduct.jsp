<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.libraryManagement.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Bill</title>
<style>
    body {
        /*background-color: #f2f2f2;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;*/
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #acb6e5);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .receipt {
        background: #fff;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        border-radius: 8px;
        padding: 30px 40px;
        width: 400px;
    }

    .receipt h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
        border-bottom: 2px solid #eee;
        padding-bottom: 10px;
    }

    .line {
        display: flex;
        justify-content: space-between;
        margin: 12px 0;
        font-size: 16px;
    }

    .total-line {
        margin-top: 20px;
        padding-top: 12px;
        border-top: 2px solid #ddd;
        font-weight: bold;
        font-size: 18px;
        color: #2c3e50;
    }

    .actions {
        text-align: center;
        margin-top: 30px;
    }

    .actions input[type="submit"],
    .actions a {
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        margin: 0 8px;
        border: none;
        border-radius: 4px;
        text-decoration: none;
        cursor: pointer;
        transition: background-color 0.3s ease;
        font-size: 14px;
    }

    .actions input[type="submit"]:hover,
    .actions a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<%
    BookBean bb = (BookBean) request.getAttribute("bean");
    int qty = (Integer) request.getAttribute("qty");
    int total = qty * bb.getPrice();
%>

<div class="receipt">
    <h2>Book Bill Receipt</h2>
    <div class="line"><span><strong>Book Code:</strong></span><span><%= bb.getId() %></span></div>
    <div class="line"><span><strong>Book Name:</strong></span><span><%= bb.getName() %></span></div>
    <div class="line"><span><strong>Author:</strong></span><span><%= bb.getAuthorName() %></span></div>
    <div class="line"><span><strong>Price:</strong></span><span>₹<%= bb.getPrice() %></span></div>
    <div class="line"><span><strong>Quantity:</strong></span><span><%= qty %></span></div>
    <div class="line total-line"><span>Total:</span><span>₹<%= total %></span></div>

    <form action="PayServlet" method="post" class="actions">
        <input type="hidden" name="id" value="<%=bb.getId()%>">
        <input type="hidden" name="qty" value="<%=qty%>">
        <input type="submit" value="Pay Now">
        <a href="CustViewBooks.jsp">Back</a>
    </form>
</div>
</body>
</html>
