<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<LINK REL="stylesheet" href="/SikakuKanri/CSS/Common.css" type="text/css"/>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<header>
<p id="title">資格取得状況管理システム</p>
</header>
<body>
<form action="RegistrationDataResult" method="get"id="item">
<p>新規登録</p>
<p>資格番号：<input type="text" name="sikakuid" ></p>
<p>資格名：<input type="text" name="sikakuname"></p>
<p>受験日：<input type="date" name="examdate"></p>
<p>合否：<input type="text" name="sof"></p>
<input type="submit"  name="Insert" value="新規登録"><br>
</form>
<footer>
<a href="/SikakuKanri/MainMenu" >戻る</a>
</footer>
</body>
</html>