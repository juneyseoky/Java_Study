package p18_JDBC_Select;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521";
			String userid = "test01";
			String userpw = "1234";
			DriverManager.getConnection(url, userid, userpw);
			
			System.out.println("Connection Ok!!");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 문제 : "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL 문제 : "+e.getMessage());
		}
	}

}
