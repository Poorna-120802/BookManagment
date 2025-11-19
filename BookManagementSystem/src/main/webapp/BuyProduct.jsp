<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.nit.libraryManagement.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Product</title>
<style>
    body {
       
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #acb6e5);
        margin: 40px;
    }
    h2 {
        text-align: center;
        color: #343a40;
    }
    table {
        width: 40%;
        margin: auto;
        border-collapse: collapse;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        border-radius: 8px;
        overflow: hidden;
    }
    td {
        padding: 12px 15px;
        border-bottom: 1px solid #ddd;
    }
    td:first-child {
        font-weight: bold;
        background-color: #f1f1f1;
        width: 40%;
    }
    td:last-child {
        background-color: #ffffff;
    }
    input[type="number"] {
        width: 100%;
        padding: 8px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    input[type="submit"] {
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
    .center-btn {
        text-align: center;
    }
</style>
</head>
<body>

<%
    BookBean bb = (BookBean) request.getAttribute("bean");
    CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
%>

<h2>Buy Product</h2>

<form action="BillBook" method="get" >  
<table>
   
    <tr>
        <td>Book ID:</td>
        <td><%= bb.getId() %></td>
    </tr>
    <tr>
        <td>Book Name:</td>
        <td><%= bb.getName() %></td>
    </tr>
    <tr>
        <td>Author Name:</td>
        <td><%= bb.getAuthorName() %></td>
    </tr>
    <tr>
        <td>Book Price:</td>
        <td><%= bb.getPrice() %></td>
    </tr>
    <tr>
        <td>Available Stock:</td>
        <td><%= bb.getQuantity() %></td>
    </tr>
    
    <tr>
        <td>Required Quantity:</td>
        <td>
            <input type="number" name="qty" min="1" max="<%= bb.getQuantity() %>" required>
            <input type="hidden" name="id" value="<%= bb.getId() %>">
        </td>
    </tr>
    <tr>
        <td colspan="2" class="center-btn">
            <input type="submit" value="Buy Book">
        </td>
    </tr>
    
    </table>
    </form>


</body>
</html>
