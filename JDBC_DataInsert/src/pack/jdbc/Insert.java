package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Connection conn;
		PreparedStatement pstmt;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/store?";
			   url += "useSSL=false&";
			   url += "characterEncoding=utf8&";
			   url += "useUnicode=true&";
			   url += "serverTimezone=Asia/Seoul&";
			   url += "allowPublicKeyRetrieval=true";
			String uid = "root";
			String upw = "1234";
			
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("상품 코드를 입력해주세요: " );
			String goodsCode = sc.next();
			
			System.out.print("상품 이름을 입력해주세요: " );
			String goodsName = sc.next();
			
			System.out.print("상품 가격을 입력해주세요: " );
			int price = sc.nextInt();
			
			System.out.print("상품 재고 수량을 입력해주세요: " );
			int stock = sc.nextInt();
			

			sc.close();
			
			String sql = "insert into item(goodsCode, goodsName, price, stock) "+
						"values(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goodsCode);
			pstmt.setString(2, goodsName);
			pstmt.setInt(3, price);
			pstmt.setInt(4, stock);
			
			int rtnVal = pstmt.executeUpdate();
			if(rtnVal == 1 )System.out.println("입력완료");
			

		} catch (ClassNotFoundException e) {
			System.out.println("CNFE : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLE : " + e.getMessage());
		}
	}

}
