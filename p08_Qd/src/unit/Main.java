package unit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String unit = "";
		System.out.print("입력 선택(1. 킬로미터 	2. 마일) : " );
		int num = sc.nextInt();
		if(num == 1) {
			System.out.print("킬로미터 입력(km) : ");
			unit = "km";
		}else if(num == 2) {
			System.out.print("마일 입력 (mile) : ");
			unit = "mile";
		}else {
			System.out.println("똑바로 넣어라");
			System.exit(0);
		}
		int dis = sc.nextInt();
		System.out.println("-----------------------");
		Change change = new Change(dis, unit);
		sc.close();
		
		change.mtd();
	}

}
