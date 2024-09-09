package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaffAdd {
	private String userid;
	private String username;
	private int yearRank;
	private String position;

	Connection conn = null;
	PreparedStatement pstmt = null;

	public StaffAdd(String userid, String username, int yearRank, String position) {
		this.userid = userid;
		this.username = username;
		this.yearRank = yearRank;
		this.position = position;
	}

	public void insertStaff() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "manager01";
			String upw = "1234";
			String sql = "";
			conn = DriverManager.getConnection(url, uid, upw);

			sql = "insert into staff values(staff_SEQ.NEXTVAL, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, username);
			pstmt.setInt(3, yearRank);
			pstmt.setString(4, position);

			int rsNum = pstmt.executeUpdate();
			conn.commit();
			if (rsNum == 1) {
				System.out.println("등록완료");
			} else {
				System.out.println("등록 실패");
			}

			System.out.println();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
