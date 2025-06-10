<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    // 예시용 조건: 테스트 사용자
    String resultId = "";
    if ("홍길동".equals(name) && "test@example.com".equals(email)) {
        resultId = "hong123";
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>아이디 찾기 결과</title>
    <style>
        body {
            background-color: #f0f0f0;
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .result-box {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            text-align: center;
            width: 400px;
        }
        h2 {
            color: #444444;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
        }
        a {
            display: inline-block;
            margin-top: 25px;
            padding: 10px 20px;
            background-color: #444444;
            color: white;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
        }
        a:hover {
            background-color: #222222;
        }
    </style>
</head>
<body>
    <div class="result-box">
        <h2>아이디 찾기 결과</h2>
        <% if (!resultId.isEmpty()) { %>
            <p><strong><%= name %></strong> 님의 아이디는 <strong><%= resultId %></strong> 입니다.</p>
        <% } else { %>
            <p>입력한 정보와 일치하는 아이디가 없습니다.</p>
        <% } %>
        <a href="findAccount.jsp">← 다시 찾기</a>
    </div>
</body>
</html>
