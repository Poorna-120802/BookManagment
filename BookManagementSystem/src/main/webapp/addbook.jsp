<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book Success</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #acb6e5);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .container {
        background: white;
        padding: 30px 40px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        text-align: center;
        max-width: 400px;
        width: 100%;
    }
   
    .message {
        margin: 20px 0;
        font-size: 18px;
        color: #333;
    }
    .btn {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 12px 20px;
        margin: 10px 5px;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s ease;
        text-decoration: none;
        display: inline-block;
    }
    .btn:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        
        <div class="message">
            <%
                String str = (String) request.getAttribute("msg");
            %>
            <h2><%=str %></h2>
        </div>
        <div>
            <!-- Back button: adjust href as needed -->
            <a href="AdminLoginSuccess.jsp" class="btn">Back</a>
            
            <!-- Logout button: adjust href to your logout servlet or page -->
            <a href="logout" class="btn">Logout</a>
        </div>
    </div>
</body>
</html>
