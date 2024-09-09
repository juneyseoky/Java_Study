package pkg.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	private static Connection conn;
	// 무조건 필수 => DB 연동
	
	private static PreparedStatement pstmt;
	// 매개변수를 사용할수 있음.(? 사용가능)
	// Insert, update 에 주로 사용됨


	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String user = "test01";
			String userpw = "1234";
			String query = "";
			
			conn = DriverManager.getConnection(url, user, userpw);
			query = "insert into goodslist values (?, ?, ?, ?, ?, sysdate)";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, 10);
			pstmt.setString(2, "coffee");
			pstmt.setString(3, "커피");
			pstmt.setInt(4, 3000);
			pstmt.setString(5, "연하게");
			
			int rsNum = pstmt.executeUpdate();
			if(rsNum==1) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("접속불량");
		} catch (SQLException e ) {
			System.out.println("SQL 불량"+e.getMessage());
		}
	}

}
