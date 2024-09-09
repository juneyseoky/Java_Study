package pkg.quiz01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력(2~100) : " );
			int num = sc.nextInt();
			Calc cal = new Calc(num);
			cal.divisor();
			cal.diviCnt();
			cal.primeNum();
			
		} catch (Exception e) {
			System.out.println();
		}finally {
			sc.close();
			System.out.println("\nPrint Ok!");
		}
	}

}
