package Quiz_Drill;

import java.util.Scanner;

public class ListAdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받을 숫자 개수 : " );
		int num = sc.nextInt();
		int[] numAry = new int[num];
		System.out.print("숫자 "+num+"개 입력 : ");
		for (int i = 0; i < numAry.length; i++) {
			numAry[i] = sc.nextInt();
		}
		sc.close();
		
		mthRev(numAry);
	}

	private static void mthRev(int[] num) {
		System.out.println("입력 숫자들의 역순");
		for (int i = num.length-1; i >=0; i--) {
			System.out.print(num[i] + "\t");
		}
		System.out.println("\n\n End");
	}

}
