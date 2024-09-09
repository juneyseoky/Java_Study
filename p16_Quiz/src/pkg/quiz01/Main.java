package pkg.quiz01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x 값 입력: " );
		double num = sc.nextDouble();
		sc.close();
		AbsValue abs = x -> Math.abs(2*(Math.pow(x, 3))+3*(Math.pow(x, 2))+4);
	
		double res = abs.mtdAbs(num);
		
		System.out.printf("절대값은 %.2f 입니다.\n\nEnd.",res);

	}

}
