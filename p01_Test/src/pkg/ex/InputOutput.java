package pkg.ex;

import java.util.Scanner;

public class InputOutput {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : " );
		int num = sc.nextInt();
		int sum = customMethod(num);
		sc.close();
		
		
//		String res = (num % 2 == 0) ? "짝수" : "홀수";
		String res = "1부터 입력한 숫자 " + num +
					"까지의 합은" + sum +"입니다.";
		
		System.out.println(res);
		System.out.println("Test");
		
		
	}

	public static int customMethod(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		return sum;
	}
	
}
