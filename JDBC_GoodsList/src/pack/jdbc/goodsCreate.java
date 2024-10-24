package pack.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class goodsCreate extends DBConnection {
	private Connection conn;
	private PreparedStatement pstmt;
	 private Scanner sc;
		
	public goodsCreate(Scanner sc) {
		this.sc = sc;
	}
	
	// ClubFeeList의 mtdMemList 메서드명과 같음
	public void mthCrud() {
		goodsDelete gd = new goodsDelete(sc);
		String gCode = "";
		String gName = "";
		int price = 0;
		conn = super.dbconn;
		
		try {
//			Scanner sc = new Scanner(System.in);
			
			while(true) {				
				System.out.print("상품코드 입력 : " );
				gCode = sc.next();
					if(gd.isInteger(gCode)) {
						System.out.println("상품코드는 문자 + 숫자로만 이루어집니다.");
						continue;
					}
				
				System.out.print("상품명 입력 : ");
				gName = sc.next();
				
				System.out.print("판매가 입력 : ");
				price = sc.nextInt();
				String sql = "insert into goodslist (gCode, gName, price, regTM) ";
				sql += "values (?, ?, ?, now())";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gCode);
				pstmt.setString(2, gName);
				pstmt.setInt(3, price);
				
				int resVal = pstmt.executeUpdate();
				if(resVal == 1) {
					System.out.println("입력완료");
					break;
				}
			}			
			
		} catch (SQLException e) {
			System.out.println("SQLE : " + e.getMessage());
		}
	}
}
