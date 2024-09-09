package pkg;

import java.util.Arrays;
import java.util.Scanner;

public class quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 이메일 수 :");
		int eCnt = sc.nextInt();
		System.out.println();
		String[] eIds = new String[eCnt];
	
		for (int i = 0; i < eCnt; i++) {
			System.out.print((i+1)+"번 입력 : ");
			String email = sc.next();			
			String[] eId = email.split("@");
			eIds[i] = eId[1];
//			int index = email	.indexOf("@");
//			String fi = email.substring(0,index);
//			eIds[i] =fi;
		}
		
		sc.close();
		Arrays.sort(eIds);
		System.out.println("\n----------------------------");
		
		System.out.println(Arrays.toString(eIds));
		System.out.println("\n\nEnd");
	 }
	
}
