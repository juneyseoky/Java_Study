package pack_ingerit;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		double[] num = new double[3];
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 3개를 입력 : " );
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
		}
		sc.close();
		
		Average avg = new Average(num);
		
		result = avg.mtdAvg();
		System.out.printf("평균 : %.2f \n", result);
	}

}
