package qd01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수당 입력 : " );
		int num = sc.nextInt();
		
		MyPay pay = new MyPay(num);
		pay.real();

		sc.close();
	}

}
