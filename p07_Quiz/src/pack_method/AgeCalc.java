package pack_method;

import java.util.Scanner;

public class AgeCalc {

	public static void main(String[] args) {
		int[] age = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<age.length; i++) {
			System.out.print((i+1)+". 나이를 입력하세요 : " );
			int num = scanner.nextInt();
			age[i] = num;			
		}
		scanner.close();
		double re = mtaAg(age);
		System.out.println("\n다섯명의 평균 나이 : " + re);
		System.out.println("Print OK!");

	}

	private static double mtaAg(int[] age) {
		int total = 0;
		for(int i=0; i<age.length; i++) {
			total += age[i];			
		}
		double re = total/age.length;
		
		return re;
	}

}
