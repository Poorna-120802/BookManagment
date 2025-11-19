<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Login</title>
    <style>
        /* Your existing styles */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #74ebd5, #acb6e5);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .login-container {
            background-color: #ffffff;
            padding: 40px 50px;
            border-radius: 16px;
            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 420px;
            text-align: center;
            transition: all 0.3s ease;
        }

        .alert-success {
           /* background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;*/
            padding: 15px;
            border-radius: 8px;
            margin-bottom: 20px;
            font-size: 15px;
            font-weight: 500;
        }

        h2 {
            color: #2c3e50;
            margin-bottom: 30px;
            font-size: 28px;
        }

        /* (Keep rest of your existing styles here unchanged) */
    </style>
</head>
<body>

<div class="login-container">
    <%
        String msg = (String) request.getAttribute("msg");
        if (msg != null && !msg.trim().isEmpty()) {
    %>
    <div class="alert-success">
        <%= msg %>
    </div>
    <%
        }
    %>

    <!-- Including the HTML login form -->
    <%@ include file="CustomerLogin.html" %>
</div>

</body>
</html>
