<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>아이디 / 비밀번호 찾기</title>
    <style>
        body {
            background-color: #f0f0f0;
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-box {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 450px;
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
        }
        input[type="submit"] {
            width: 100%;
            margin-top: 20px;
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
        hr {
            margin: 30px 0;
            border: none;
            border-top: 1px solid #ddd;
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
    <div class="form-box">
        <h2>아이디 찾기</h2>
        <form method="post" action="findIdResult.jsp">
            <label for="name">이름</label>
            <input type="text" name="name" id="name" required>

            <label for="email">이메일</label>
            <input type="text" name="email" id="email" required>

            <input type="submit" value="아이디 찾기">
        </form>

        <hr>

        <h2>비밀번호 찾기</h2>
        <form method="post" action="findPwResult.jsp">
            <label for="username">아이디</label>
            <input type="text" name="username" id="username" required>

            <label for="email2">이메일</label>
            <input type="text" name="email" id="email2" required>

            <input type="submit" value="비밀번호 찾기">
        </form>

        <a class="back-link" href="menu.jsp">← 메뉴로 돌아가기</a>
    </div>
</body>
</html>
