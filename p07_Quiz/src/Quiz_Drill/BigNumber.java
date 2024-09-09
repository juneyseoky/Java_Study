package Quiz_Drill;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 숫자 개수 지정 : " );
		int num = sc.nextInt();
		double[] list = new double[num];
		System.out.print("임의의 숫자 "+num+"개를 입력하세요.");
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextDouble();
		}
		mthEst(list);
		sc.close();
	}

	private static void mthEst(double[] list) {
		double maxNum = list[0];
		
		for (int i = 0; i < list.length; i++) {
			if(list[i] >maxNum) {
				maxNum = list[i];
			}
		}
		System.out.println("\n가장 큰 수 : "+ maxNum+"\n\n End");
	
		
	}

}
