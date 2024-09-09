package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = 2016;
		int[] taker = new int[5];
		int[] pass = new int[5];
		System.out.println("[ 국가기술자격 응시결과 ]\n");	
		System.out.println("2016년 ~ 2020년의 응시자수와 합격자수를 입력한 후 프로그램을");
		System.out.println("작성하여 아래의 결과를 출력하시오.");
		System.out.println("① 년도별 합격률	② 평균 합격률	③ 평균이상 합격횟수\n");
		
		System.out.println("1. 입력" );
		System.out.println("년도	응시자수	합격자수");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < pass.length; i++) {
			System.out.print(year + "    ");
			taker[i] = sc.nextInt();
			pass[i] = sc.nextInt();
			year++;
		}
		sc.close();
//		System.out.println(Arrays.toString(taker));
//		System.out.println(Arrays.toString(pass));
		Exam ex = new Exam(taker,pass);
		ex.passRate();
		ex.passAvg();
		ex.passCnt();
	}

}
