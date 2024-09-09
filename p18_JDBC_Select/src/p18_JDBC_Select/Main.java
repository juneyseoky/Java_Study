package p18_JDBC_Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String userid = "test01";
			String userpw = "1234";
			conn = DriverManager.getConnection(url, userid, userpw);
			
			System.out.println("Connection Ok!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from sample");
//			System.out.println(rs.get);
			if(rs.next()) {
				System.out.println("번호 : "+rs.getInt(1));
				System.out.println("아이디 : "+rs.getString("userid"));
				System.out.println("비밀번호 : "+rs.getString("userpw"));
				System.out.println("이름 : "+rs.getString("usernm"));
				System.out.println("시간 : "+rs.getString("nowtm"));
			}
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("JDBC 문제 : "+e.getMessage());
			
		} catch (SQLException e) {
			
			System.out.println("SQL 문제 : "+e.getMessage());
			
		}
	}

}
