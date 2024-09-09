package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StaffDelete {
	private int usernum;
	Connection conn = null;
	PreparedStatement pstmt = null;

	public StaffDelete(int usernum) {
		this.usernum = usernum;
	}

	public void removeStaff() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "manager01";
			String upw = "1234";
			String sql = "";

			conn = DriverManager.getConnection(url, uid, upw);
			sql = "delete staff where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, usernum);

			int rsNum = pstmt.executeUpdate();
			if (rsNum == 1) {
				System.out.println("자료가 삭제되었습니다!");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
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

	}

}
