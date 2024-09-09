package qd02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = null;
		int firstNum = 0;
		int secondNum = 0;
		try {
			while(true) {
				sc = new Scanner(System.in);
				System.out.print("값 2개 입력 : " );
				firstNum = sc.nextInt();
				secondNum = sc.nextInt();
				if((firstNum>1 && firstNum <10) && (secondNum>1 && secondNum <10)) {
					break;
				}else {
					System.out.println("입력범위 초과 재입력요청 !\n");
				}
			}
			System.out.println("------------------------------------------");
			System.out.print("누적 방식(홀수/짝수) : ");
			String numType = sc.next();
			Calc calc = new Calc(firstNum, secondNum, numType);
			
			calc.sum();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\nEnd");
		}
		
	}

}
