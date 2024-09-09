package qd03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("10진수 입력(0~255) : " );
			int num = sc.nextInt();
			if(num>= 0 && num<=255) {
				binary bina = new binary(num);
				bina.changeB();
				break;
			}else {
				System.out.println("0~255 사이의 값을 입력해주세요.\n");
			}
		}

		sc.close();
	}

}
