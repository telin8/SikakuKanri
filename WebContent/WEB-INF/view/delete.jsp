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
<form action="DeleteStudentResult" method="get" id="item">
		<p id="subtitle">データ削除</p>
			<p id="studentdelete">削除したい学籍番号：</p>
			<a><input type="text" name="studentdelete"></a>
		<input type="submit" onclick="location.href='/SikakuKanri/DeleteStudentResult'" name="Deletestudent" value="学生削除">
			<p id="studentdelete">削除したい受験番号：</p>
			<a><input type="text" name="sikakudelete"></a>
		<input type="submit" onclick="location.href='/SikakuKanri/DeleteStudentResult'" name="Deletesikaku" value="受験履歴削除"><br>
		</form>
	<footer>
		<a href="/SikakuKanri/SikakuMain">メインメニューへ</a>
	</footer>
</body>
</html>