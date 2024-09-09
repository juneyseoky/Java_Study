package qd04;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		int num= 0;
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				System.out.print("숫자 입력 : " );
				num = sc.nextInt();
				if(num <3 || num >9) {
					System.out.println("\n입력 오류!");
					System.out.println("프로그램을 재실행 하신후");
					System.out.println("다시 입력해주세요.\n");
					System.out.println("End");
					System.exit(0);
				}else {
					break;
				}
			}
			numRepeat rep = new numRepeat(num);
			rep.repeat();
			
						
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\nEnd");
		}
	}

}
