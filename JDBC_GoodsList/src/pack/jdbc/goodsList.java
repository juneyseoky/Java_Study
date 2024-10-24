package pack.jdbc;

import java.util.Scanner;

public class goodsList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DBConnection dbconn = null;
		
		while(true) {
			try {
				System.out.println("작업을 선택하세요.");
				System.out.println();
				System.out.println("1. 상품목록 보기   2. 상품입력   3. 상품삭제   4. 끝내기");
				System.out.print("번호입력 : ");
				String num = sc.next();				
				if(Integer.parseInt(num) == 1) {
					// 상품목록 보기 
					System.out.println();
					dbconn = new goodsSelect();
				}else if(Integer.parseInt(num) == 2) {
					// 상품입력
					System.out.println();
					dbconn = new goodsCreate(sc);
				}else if(Integer.parseInt(num) == 3) {
					// 상품삭제
					System.out.println();
					dbconn = new goodsDelete(sc);
				}else if(Integer.parseInt(num) == 4) {
					// 끝내기
					System.out.println();
					System.out.println("프로그램 종료!!");
					break;
				} else {
					System.out.println("보기에 나와있는 번호만 입력하세요!!\n");
					continue;
				}
				dbconn.mthCrud();
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력해라");
				continue;
			}
		}
		sc.close();

	}

}
