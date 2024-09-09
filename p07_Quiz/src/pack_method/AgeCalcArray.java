package pack_method;

import java.util.ArrayList;
import java.util.Scanner;

public class AgeCalcArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+". 나이를 입력하세요 : ");
			age = scanner.nextInt();
			list.add(age);
		}
		scanner.close();
		mtaAge(list);
		

	}

	private static void mtaAge(ArrayList<Integer> list) {
		int sum = 0;
 
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		double avg = sum/list.size();
		
		System.out.println("\n다섯명의 평균 나이 : " + avg);
		System.out.println("Print OK!");
	}
	

}
