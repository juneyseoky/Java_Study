package pkg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("예외(Exception, 익셉션)");
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :" );
		int num = sc.nextInt();
		sc.close();
	}
}
