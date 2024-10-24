<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<meta charset="UTF-8">
<title>MySQL JDBC Select 출력</title>
</head>
<body>
	<h1>JDBC 조회</h1>
	<% 
	Connection conn;
	// DB 접속(=연동)
	Statement stmt;
	// SQL 구문
	ResultSet rs;
	// Select 값 반환
	
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
			
//			System.out.println("MySQL Company DB 접속 성공!!!");
			
			stmt = conn.createStatement();
			
			String sql = "select * from staffList order by num desc";
			rs = stmt.executeQuery(sql);
			
			out.println("번호&nbsp;&nbsp; 아이디&nbsp;&nbsp; 이름&nbsp;&nbsp; 나이&nbsp;&nbsp; 주소<br>");
			out.println("-----------------------------------------<br>");
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				out.print(num + "&nbsp;&nbsp;");
				out.print(id + "&nbsp;&nbsp;");
				out.print(name + "&nbsp;&nbsp;");
				out.print(age + "&nbsp;&nbsp;");
				out.println(address+"<br>");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("CNFE : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLE : " + e.getMessage());
		}
	%>
</body>
</html>