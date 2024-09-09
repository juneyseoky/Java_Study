package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("입력할 문자 개수(2~5) : ");
			num = sc.nextInt();
			System.out.println();
			if(num > 1 && num <= 5) {
				System.out.printf("문자 %d개 입력\n",num);
				break;
			}else {
				System.out.println("2~5사이의 값을 입력해주세요");				
			}
		}
		String[] strList = new String[num];
		String str = new String();
		for (int i = 0; i < num; i++) {
			System.out.print((i+1)+". 입력값 : ");
			str = sc.next();
			strList[i] = str;
		}
		
		System.out.println();
		Arrays.sort(strList);
		System.out.println("오름차순 정렬 : " + Arrays.toString(strList));
		Arrays.sort(strList, Collections.reverseOrder());
		System.out.println("내림차순 정렬 : " + Arrays.toString(strList));
		sc.close();

	}

}
