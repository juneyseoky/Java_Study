package pkg.inout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. 입력에는 Scanner 적용
		// 2. 입출력을 모두 구현
		int num = 0;
		String code = null;
		String name = null;
		int price = 0;
		String opt = null;
		String makedate = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Statement stmt = null;

		System.out.println("OJDBC를 활용한 입출력 프로그램 구현");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("번호 입력 : ");
			num = sc.nextInt();
			System.out.print("코드 입력 : ");
			code = sc.next();
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("가격 입력 : ");
			price = sc.nextInt();
			System.out.print("옵션 입력 : ");
			opt = sc.next();
			System.out.print("제조일 입력 : ");
			makedate = sc.next();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String user = "test01";
			String userpw = "1234";
			String query = "";

			conn = DriverManager.getConnection(url, user, userpw);
			query = "insert into goodslist (num, code, name, price, opt, makedate) " + "values(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, num);
			pstmt.setString(2, code);
			pstmt.setString(3, name);
			pstmt.setInt(4, price);
			pstmt.setString(5, opt);
			pstmt.setString(6, makedate);
			int res = pstmt.executeUpdate();
			if (res == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			stmt = conn.createStatement();

			query = "select num, code, name, price, opt, makedate " + "from goodsList order by num desc";
			rs = stmt.executeQuery(query);

			System.out.println("Num \t Code \t Name \t Price \t Opt \t Makedate");
			System.out.println("-------------------------------------------------------------\n");

			while (rs.next()) {
				String str = rs.getInt("num") + "\t";
				str += rs.getString("code") + "\t";
				str += rs.getString("name") + "\t";
				str += rs.getInt("price") + "\t";
				str += rs.getString("opt") + "\t";
				str += rs.getString("makedate");
				System.out.println(str);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
