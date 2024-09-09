package pack_array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int cnt = 1;
		int total = 0;
		String res = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("[입력 값의 누적 구하기");
		System.out.print("숫자 개수 입력 : ");
		int num = sc.nextInt();
		int[] numList = new int[num];
		for(int i=0; i<numList.length; i++) {
			System.out.print(cnt+"번째 숫자를 입력 : ");
			numList[i] = sc.nextInt();
			cnt++;
			total += numList[i];
			if(i==(numList.length-1)) {
				res += numList[i] + " = ";
			}else{
				res += numList[i] + " + ";
			}
		}
		System.out.println("--------------------------");
		System.out.println("누적결과");
		System.out.println(res + total);
		System.out.println("\nPrint OK!");
		sc.close();

	}

}
