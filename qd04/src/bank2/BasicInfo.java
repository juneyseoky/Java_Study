package bank2;

import java.text.DecimalFormat;

public class BasicInfo {
	// 슈퍼클래스
	// static 구조 
	protected static String account;	// 계좌번호
	protected static int balance;		// 계좌잔액
	
	public BasicInfo(String account) {
		this.account= account;
	}

	public void mtdBalance() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(account+ " 계좌잔액 : "+ df.format(balance) + " 원");

	}

	public void mtdDeposit(int amount) { // 입금
	}

	public void mtdWithdraw(int amount) {
	}

	
}
