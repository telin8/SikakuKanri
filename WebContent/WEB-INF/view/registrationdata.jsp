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
	<form action="RegistrationDataResult" method="get" id="item">
		<p id="subtitle">新規登録</p>
		<p>
			受験番号：<input type="text" name="sikakuid">
		</p>
		<p>
			資格名：<input type="text" name="sikakuname">
		</p>
		<p>
			受験日：<input type="date" name="examdate">
		</p>
		<p>
			合否：<input list="sof" name="sof">
		</p>
		<datalist id="sof">
			<option value="合格"></option>
			<option value="不合格"></option>
		</datalist>
		<input type="submit" name="Insert" value="新規登録"><br>
	</form>
	<footer>
		<a href="/SikakuKanri/SikakuMain">メインメニューへ</a>
	</footer>
</body>
</html>