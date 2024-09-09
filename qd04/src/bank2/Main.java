package bank2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("계좌번호 입력(6자리 숫자) : ");
			
			String account = sc.next();
			
			BasicInfo basicInfo = new Deposit(account);
			int amount = 0;
			
			while(true) {
				System.out.println("\n온라인 뱅킹 메뉴 선택");
				System.out.print("1. 잔액확인 2.입금 3.출금 9.종료 :");
				
				int bankMenu = sc.nextInt(); // 온라인 뱅킹 메뉴
				if(bankMenu == 1) {
					// 잔액 확인
//					basicInfo = new BasicInfo(account);
					basicInfo.mtdBalance();
					
				}else if(bankMenu == 2) {
					// 입금 처리
					System.out.print("입금액 : ");
					amount = sc.nextInt();
					basicInfo = new Deposit(account);
					basicInfo.mtdDeposit(amount);
					
				}else if(bankMenu == 3) {
					System.out.print("출금액 : ");
					amount = sc.nextInt();
					basicInfo = new Withdraw(account);
					basicInfo.mtdWithdraw(amount);
				}else if(bankMenu == 9) {
					System.out.println("\n온라인 뱅킹을 종료합니다.");
					break;					
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
