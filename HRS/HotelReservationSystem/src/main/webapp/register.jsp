<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        session.setAttribute("name", request.getParameter("name"));
        session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password"));
        response.sendRedirect("registerSuccess.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <style>
        body {
            background-color: #f0f0f0;
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 400px;
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
        }
        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #cccccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            margin-top: 25px;
            padding: 12px;
            background-color: #444444;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #222222;
        }
        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #3366cc;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>회원가입</h2>
        <form method="post">
            <label>이름</label>
            <input type="text" name="name" id="name" required>

            <label>아이디</label>
            <input type="text" name="username" id="username" required>

            <label>비밀번호</label>
            <input type="password" name="password" id="password" required>

            <input type="submit" value="가입하기">
        </form>
        <a class="back-link" href="menu.jsp">← 메뉴로 돌아가기</a>
    </div>
</body>
</html>
