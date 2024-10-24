package pack.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class goodsDelete extends DBConnection {
    private Connection conn;
    private PreparedStatement pstmt;
    private Scanner sc;
	
	public goodsDelete(Scanner sc) {
		this.sc = sc;
	}

    public void mthCrud() {
//        Scanner sc = new Scanner(System.in); // Scanner 초기화
        System.out.print("삭제할 상품번호 또는 상품코드 입력: ");
        String toDelete = sc.next();
        String sql = "";

        try {
            conn = super.dbconn; // DB 연결
            if (isInteger(toDelete)) {
                sql = "delete from goodslist where num = ?";
                int del = Integer.parseInt(toDelete);
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, del);
            } else {
                sql = "delete from goodslist where gCode = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, toDelete);
            }

            int resVal = pstmt.executeUpdate();

            if (resVal == 1) {
                System.out.println("삭제 완료");
            } else {
                System.out.println("해당 상품이 존재하지 않습니다.");
            }
        } catch (SQLException e) {
            System.out.println("SQLE : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("입력 형식이 올바르지 않습니다: " + e.getMessage());
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str); // 문자열을 정수로 변환 시도
            return true; // 변환 성공 시 true 반환
        } catch (NumberFormatException e) {
            return false; // 변환 실패 시 false 반환
        }
    }
}
