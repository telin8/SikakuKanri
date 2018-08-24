<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="DTO.SikakuDTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Servlet.SikakuAllShow"%>
<!DOCTYPE HTML>
<html>
<head>
<LINK REL="stylesheet" href="/SikakuKanri/CSS/Common.css"
	type="text/css" />
<meta charset="UTF-8">
<title>一覧表示</title>
</head>
<header>
	<p id="title">資格管理システム</p>
</header>
<body>
	<div id="item">
		<table border="1" id="table">
			<tr id="table">
				<th>資格ＩＤ</th>
				<th>資格名</th>
				<th>受験日</th>
				<th>合否</th>
			</tr>
			<%
				ArrayList<SikakuDTO> AList = (ArrayList<SikakuDTO>) request.getAttribute("a");
			%>
			<%
				for (SikakuDTO d : AList) {
			%>
			<tr id="table">
				<td><%=d.getSikakuId()%></td>
				<td><%=d.getSikakuName()%></td>
				<td><%=d.getExamDate()%></td>
				<td><%=d.getSof()%>
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