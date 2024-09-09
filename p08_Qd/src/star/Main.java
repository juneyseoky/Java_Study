package star;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.print("숫자를 입력해 주세요 (1~10) : " );
			num = sc.nextInt();
			
			if(num<=0 || num >=10) {
				System.out.println("1이상 10이하 정수만 가능\n");
				System.out.println("재실행");
				continue;
			}
			break;
		}
		

		sc.close();
		Star star = new Star(num);
		
		star.mtd();
	}

}
