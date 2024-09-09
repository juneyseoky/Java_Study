package conversion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[출력결과]");
		System.out.println("-----------------------------------");
		System.out.print("화씨 온도를 입력하세요 :" );
		int num = sc.nextInt();

		sc.close();
		TempCalc tem = new TempCalc(num);
		
		tem.mtd();
	}

}
