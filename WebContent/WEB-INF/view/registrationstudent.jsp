<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<LINK REL="stylesheet" href="/SikakuKanri/CSS/Common.css"
	type="text/css" />
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<header>
	<p id="title">資格取得状況管理システム</p>
</header>
<body>
	<form action="RegistrationStudentResult" method="get" id="item">
		<p>新規登録</p>
		<p>
			学籍番号：<input type="text" name="studentid">
		</p>
		<p>
			名前：<input type="text" name="studentname">
		</p>
		<p>
			年齢：<input type="text" name="studentage">
		</p>
		<p>
			性別：<input list="gender" name="studentgender">
		</p>
		<datalist id="gender">
			<option value="男"></option>
			<option value="女"></option>
		</datalist>
		<input type="submit" name="Insert" value="新規登録"><br>
	</form>
	<footer>
		<a href="/SikakuKanri/SikakuMain">メインメニューへ</a>
	</footer>
</body>
</html>