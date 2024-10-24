package pack.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

public class goodsSelect extends DBConnection {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	// ClubFeeList의 mtdMemList 메서드명과 같음
	public void mthCrud() {
		try {
			
			conn = super.dbconn;
			stmt = conn.createStatement();
			String sql = "select num, gCode, gName, price, regTM ";
					sql += "from goodslist order by num desc";
			rs = stmt.executeQuery(sql);
			System.out.println("번호	상품코드	상품명	판매가	등록날짜");
			System.out.println("--------------------------------------------------");
			while (rs.next()) {
				
				Timestamp regTM = rs.getTimestamp("regTM");
				String regTime = regTM.toString();
				String res = "";
				res += rs.getInt("num") + "	";
				res += rs.getString("gCode") + "		";
				res += rs.getString("gName") + "	";
				res += rs.getString("price") + "	";
				res += regTime.substring(0, 10);
				System.out.println(res);
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("SQLE : " + e.getMessage());
		}
	}

}
