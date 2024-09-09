package qd02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("거리(km)와 속력(km/h) 입력 : " );
		double km = sc.nextDouble();
		double speed = sc.nextDouble();
		sc.close();
		
		Required req = new Required(km, speed);
		
		req.mtd();

	}

}
