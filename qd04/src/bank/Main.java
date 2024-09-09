package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌번호 입력(6자리 숫자) : " );
		int account = sc.nextInt();
		System.out.println();
		
//		BasicInfo info = new BasicInfo(account);
		Deposit depo = new Deposit(account);
		Withdraw with = new Withdraw(account);
		while(true) {
			System.out.println("온라인 뱅킹 메뉴 선택");
			System.out.print("1.잔액확인 2.입금 3.출금 9.종료 :");
			int type = sc.nextInt();
			if(type == 1) {
				depo.mtdBalance();
			}else if(type == 2) {
				System.out.print("입금액 : " );
				int amount = sc.nextInt();
				depo.mtdDeposit(amount);
			}else if(type == 3){
				System.out.println("출금액");
				int amount = sc.nextInt();
				with.mtdWithdraw(amount);
				
			}else {
				System.out.println("\n온라인 뱅킹을 종료합니다.");
				sc.close();
				System.exit(0);
			}
		}
	}

}
