<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 목록 페이지</title>
</head>
<body>
<h1>직원 목록 페이지</h1>

<table>
<tbody>
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>년차</th>
		<th>직위</th>
	</tr>
<%

Connection conn;
Statement stmt;
ResultSet rs;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/company?";
	   url += "useSSL=false&";
	   url += "characterEncoding=utf8&";
	   url += "useUnicode=true&";
	   url += "serverTimezone=Asia/Seoul&";
	   url += "allowPublicKeyRetrieval=true";
	String uid = "root";
	String upw = "1234";
	
	conn = DriverManager.getConnection(url, uid, upw);
	stmt = conn.createStatement();
	String sql = "select num, id, name, yearRank, position ";
			sql += "from memlist order by num desc";
	rs = stmt.executeQuery(sql);
	while (rs.next()) {

		String res = "";
		res += "<tr><td>";
		res += rs.getInt("num") + "</td><td>";
		res += rs.getString("id") + "</td><td>";
		res += rs.getString("name") +"</td><td>";
		res += rs.getString("yearRank") + "</td><td>";
		res += rs.getString("position") + "</td></tr>";

		out.print(res);
	}
} catch (SQLException e) {
	System.out.println("SQLE : " + e.getMessage());
}
%>
</tbody>
</table>
<button type="button">입력페이지로 이동</button>
<script>
let bntDom = document.querySelector("button");

bntDom.addEventListener("click",()=>{
	location.href = "insert.html";
});
</script>
</body>
</html>