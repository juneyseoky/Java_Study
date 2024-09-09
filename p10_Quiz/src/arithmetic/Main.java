package arithmetic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double firstNum = 0.0;
		double secondNum =0.0;
		double res = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연산 종류 (1.더하기	2.빼기	3.곱하기	4.나누기)" );
		System.out.print("수행 연산 선택 : ");
		int num = sc.nextInt();
		if(num>4) {
			System.out.println("보기중에 골라라");
			System.exit(0);
		}
		System.out.print("숫자 2개 입력 : ");
		firstNum = sc.nextDouble();
		secondNum = sc.nextDouble();
		
		Calculator NAC = null;
		switch(num){
			case(1):
				NAC = new Addition();
				break;
			case(2):
				NAC = new Subtraction();
				break;
			case(3):
				NAC = new Multiplication();
				break;
			case(4):
				NAC = new Division();
				break;			
		}
		
		res = NAC.calc(firstNum,secondNum);
		sc.close();
		System.out.println("---------------------------------------------");
		System.out.printf("결과 : %.1f \n\nEnd",res);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
