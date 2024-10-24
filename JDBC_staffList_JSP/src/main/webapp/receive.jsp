<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>데이터 수신 페이지</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	int yearRank = Integer.parseInt(request.getParameter("yearRank"));
	String position = request.getParameter("position");
	
	out.print("id : " + id +"<br>");
	out.print("name : " + name +"<br>");
	out.print("yearRank : " + yearRank +"<br>");
	out.print("position : " + position +"<br>");
	
	Connection conn;
	PreparedStatement pstmt;
	
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
		String sql = "insert into memList(id, name, yearRank, position) "
				+"values (?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, yearRank);
		pstmt.setString(4, position);
		
		int resVal = pstmt.executeUpdate();
		
		if(resVal == 1) System.out.println("\n입력 완료");
	}catch(ClassNotFoundException e ) {
		
	}catch(SQLException e ) {
		
	}
	%>
	
	
	<br>
<button type="button">직원 목록보기</button>
<script>
let btnDom = document.querySelector("button");
btnDom.addEventListener("click",()=>{
	location.href="staffList.jsp";
});
</script>
</body>
</html>