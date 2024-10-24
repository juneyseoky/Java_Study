package pack.jdbc;

import java.util.Scanner;

public class staffList {

	public static void main(String[] args) {
//		Connection conn;
//		PreparedStatement pstmt;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			String url = "jdbc:mysql://localhost:3306/company?";
//			   url += "useSSL=false&";
//			   url += "characterEncoding=utf8&";
//			   url += "useUnicode=true&";
//			   url += "serverTimezone=Asia/Seoul&";
//			   url += "allowPublicKeyRetrieval=true";
//			String uid = "root";
//			String upw = "1234";
//			conn = DriverManager.getConnection(url, uid, upw);
//			String sql = "insert into memList(id, name, yearRank, position) "
//					+"values (?,?,?,?)";
//			pstmt = conn.prepareStatement(sql);
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력하세요 : " );
			String userId = sc.next();
			
			System.out.print("이름을 입력하세요 : " );
			String userName = sc.next();
			
			System.out.print("년차를 입력하세요 : " );
			int yearRank = sc.nextInt();
			
			System.out.print("직위를 입력하세요 : " );
			String position = sc.next();
			
			RefInsert ref = new RefInsert(userId,userName,yearRank,position);
			
			ref.mthInsert();
			
//			pstmt.setString(1, userId);
//			pstmt.setString(2, userName);
//			pstmt.setInt(3, yearRank);
//			pstmt.setString(4, position);
//			
//			int resVal = pstmt.executeUpdate();
//			
//			if(resVal == 1) System.out.println("\n입력 완료");
			

			sc.close();
		
		
	}

}
