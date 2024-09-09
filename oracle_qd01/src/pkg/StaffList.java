package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaffList {
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void seleteStaff() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "manager01";
			String upw = "1234";
			String sql = "";
			
			conn = DriverManager.getConnection(url, uid, upw);
			sql = "select num, userid, username, position from staff order by num desc";
//			sql = "select count(*) from staff";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("\n사원목록");
			System.out.println("---------------------------");
			System.out.println("Num \t아이디 \t이름 \t직위");
			while(rs.next()) {
				
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("userid").replace(" ", "")+"\t");
				System.out.print(rs.getString("username").replace(" ", "")+"\t");
				System.out.print(rs.getString("position").replace(" ", "")+"\t");
				System.out.println();
			}
			System.out.println();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch( SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	
}
