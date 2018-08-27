<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="DTO.SikakuDTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Servlet.StudentAllShow"%>
<!DOCTYPE HTML>
<html>
<head>
<LINK REL="stylesheet" href="/SikakuKanri/CSS/Common.css"
	type="text/css" />
<meta charset="UTF-8">
</head>
<header>
	<p id="title">資格取得状況管理システム</p>
</header>
<body>
	<div id="item">
	<p id="subtitle">学生一覧表示</p>
		<table border="1" id="table">
			<tr id="table">
				<th>学籍番号</th>
				<th>名前</th>
				<th>年齢</th>
				<th>性別</th>
			</tr>
			<%
				ArrayList<SikakuDTO> AList = (ArrayList<SikakuDTO>) request.getAttribute("a");
			%>
			<%
				for (SikakuDTO d : AList) {
			%>
			<tr id="table">
				<td><%=d.getStudentId()%></td>
				<td><%=d.getStudentName()%></td>
				<td><%=d.getStudentAge()%></td>
				<td><%=d.getStudentGender()%>
			</tr>
			<%
				}
			%>
		</table>
		<br>
	</div>
	<footer>
		<a href="/SikakuKanri/SikakuMain">メインメニューへ</a>
	</footer>
</body>
</html>