package qd03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단위를 변환할 번호를 선택하시오.");
		System.out.print("1. cm → in		2. in → cm\n");
		System.out.println();
		System.out.print("번호 입력 :");
		int num = sc.nextInt();
		System.out.println();

		Conversion con = null;
		switch (num) {
		case 1:
			System.out.print("센티미터(cm) 입력 : ");
			double cm = sc.nextDouble();
			con = new InchToCenti(cm);
			con.mtdConvs();
			break;
		case 2:
			System.out.print("센티미터(cm) 입력 : ");
			double inc = sc.nextDouble();
			con = new CentiToInch(inc);
			con.mtdConvs();
			break;
		}

		sc.close();
	}

}
