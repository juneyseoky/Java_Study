package pack_drill2;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		int cnt = 1;
		int cumul = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(cnt+ ". 숫자입력 (누적 "+ cumul+") :" );
			num = sc.nextInt();
			cnt++;
			cumul += num;
			if (num == 999) {
				System.out.println("프로그램 종료!");
				break;
			}
		}
		sc.close();

	}

}
