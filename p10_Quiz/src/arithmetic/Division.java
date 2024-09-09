package arithmetic;

import java.util.Scanner;

public class Division extends Calculator {

	@Override
	public double calc(double num1, double num2) {
		double res = num1 / num2;
		return res;
	}
//	public void s() {
//		int num =0;
//		int firstNum= 0;
//		int secondNum = 0;
//		double res = 0;
//		
//		Scanner sc = new Scanner(System.in);
//
//		
//		
//		Calculator NAC = null;
//		switch(num){
//		case(1):
//			Addition addition = new Addition();
//			res = addition.calc(firstNum,secondNum);
//			sc.close();
//			System.out.println("---------------------------------------------");
//			System.out.printf("결과 : %.1f \n\nEnd",res);
//		break;
//		case(2):
//			Subtraction subtraction = new Subtraction();
//			res = subtraction.calc(firstNum,secondNum);
//			sc.close();
//			System.out.println("---------------------------------------------");
//			System.out.printf("결과 : %.1f \n\nEnd",res);
//		break;
//		case(3):
//			Multiplication multiplication = new Multiplication();
//			res = multiplication.calc(firstNum,secondNum);
//			sc.close();
//			System.out.println("---------------------------------------------");
//			System.out.printf("결과 : %.1f \n\nEnd",res);
//		break;
//		case(4):
//			Division division = new Division();
//			res = division.calc(firstNum,secondNum);
//			sc.close();
//			System.out.println("---------------------------------------------");
//			System.out.printf("결과 : %.1f \n\nEnd",res);
//		break;			
//		}
//	}

}
