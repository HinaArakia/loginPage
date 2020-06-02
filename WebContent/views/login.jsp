<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- タグライブラリの使用を宣言（必要に応じて）  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<jsp:useBean id="loginBean" class="jp.co.aforce.beans.LoginBean" scope="request" />

<!doctype html>
<html>
<head>
<!-- 文字エンコーディングの指定 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>入力フォーム</title>
</head>
<body>
<h1>ログイン画面</h1>

<form action = "LoginServlet" method = "POST">
Username: <input type="text" name="username" ><br><br>
Password:<input type="password" name="password"><br><br>
 <input type="submit" value ="ログイン">
</form>

<p>
<c:out value="${loginBean.emsg}"/>
</p>



</body>
</html>