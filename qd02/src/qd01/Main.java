package qd01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(m/f) : " );
		String gender = sc.next();
		System.out.print("몸무게를 입력하세요(kg) : ");
		double kg = sc.nextDouble();
		System.out.print("키를 입력하세요(cm) : ");
		double cm = sc.nextDouble();
		System.out.println();
		
		CheckWeigth weight = new CheckWeigth(gender,kg,cm);
		
		weight.check();

		sc.close();
	}

}
