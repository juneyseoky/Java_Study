package pack_method;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원달러 기준환율 입력 : ");
		int exchange = sc.nextInt();
		
		System.out.print("환전할 달러 입력 : ");
		int dollar = sc.nextInt();
		sc.close();
		String msg = mtdRate(exchange,dollar);
		
		System.out.println(msg);
	}
	
	public static String mtdRate(int exchange, int dollar) {
		int money = exchange * dollar;
		String msg = /*
						 * "원달러 기준 환율 입력 : " + dall+ "\n" +"환전할 달러 입력 : " + dal + "\n"
						 */
					"환전액(KRW) : " + money + "원\n\n"
					+"End";
		return msg;
		
	}

}
