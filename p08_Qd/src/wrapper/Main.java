package wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cnt = 1;
		String str = "";
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print(cnt + "입력 : " );
			String numCode = sc.nextLine();
			if(numCode.equals("x")) break;
			
			int chkNum = Integer.parseInt(numCode);
			sum += chkNum;
			if(chkNum < 0) {
				numCode = "(" + numCode + ")";
			}
			str += numCode + " + ";
			cnt++;
			
		}
		
		sc.close();
		String str1 = str.substring(0, str.length()-2);

		Ref ref = new Ref(str1, sum);
		ref.mtd();
		

	}

}
