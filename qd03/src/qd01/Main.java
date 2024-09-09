package qd01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int multi = 0;
		while(true) {
			System.out.print("정수 입력(범위 2~10) : " );
			int num = sc.nextInt();
			multi = num;
			if(num <2 || num > 10) {
				System.out.println("범위외 입력입니다. 프로그램 종료.");
				break;
			}else {
				System.out.print(num+"의 배수 : ");
				while(multi<=50) {
					System.out.print(multi);
					multi += num; 
					if(multi <=50) System.out.print(", ");
				}
				break;
			}	
		}
		sc.close();
		System.out.println("\n\nEnd.");
	}

}
