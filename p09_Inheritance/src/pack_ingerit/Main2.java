package pack_ingerit;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		double[] num = new double[3];

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 3개를 입력 : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
		}
		sc.close();
		Variance var = new Variance(num);
		
		var.mtdVar();
	}

}
