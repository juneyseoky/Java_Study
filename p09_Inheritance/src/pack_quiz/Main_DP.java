package pack_quiz;

import java.util.Scanner;

public class Main_DP {

	public static void main(String[] args) {
		double[] num = new double[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("값 3개를 입력하세요 : " );
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextDouble();
		}
		sc.close();
		Display dis = new Display(num);
		System.out.println("입력 값은 다음과 같습니다.");
		dis.inputDouble(num);
		
	}

}
