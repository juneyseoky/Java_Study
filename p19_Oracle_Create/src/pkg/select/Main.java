package pkg.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	private static Connection conn;
	// 무조건 필수 => DB 연동
	
	private static Statement stmt;
	// Select에서 주로 사용함.
	
	private static ResultSet rs;
	// select의 결과를 반환함;

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String user = "test01";
			String userpw = "1234";
			String query = "";
			
			conn = DriverManager.getConnection(url, user, userpw);
			query = "select * from goodslist order by num desc";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query);
			
			System.out.println("Num \t\t Code \t\t Name \t\t Price \t\t Opt \t\t Makedate");
			System.out.println("---------------------------------------------------------------------------------------");
			
			while(rs.next()) {
				System.out.print("num : " + rs.getString("num"));
				System.out.print("\t\t code : " + rs.getString("code"));
				System.out.print("\t\t name : " + rs.getString("name"));
				System.out.print("\t\t price : " + rs.getString("price"));
				System.out.print("\t\t opt : " + rs.getString("opt"));
				System.out.print("\t\t makedate : " + rs.getString("makedate"));
				System.out.println();
				
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("접속불량");
		} catch (SQLException e ) {
			System.out.println("SQL 불량"+e.getMessage());
		}

	}

}
