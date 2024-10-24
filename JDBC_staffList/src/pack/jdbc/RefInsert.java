package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RefInsert {
	
	private String id;
	private String name;
	private int yearRank;
	private String position;
	
	public RefInsert(String id, String name, int yearRank, String position) {
		this.id = id;
		this.name = name;
		this.yearRank = yearRank;
		this.position = position;
	}
	
	public void mthInsert() {
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
		
	}

}
