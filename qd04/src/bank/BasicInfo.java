package bank;

import java.text.DecimalFormat;

public class BasicInfo {
	protected int account;
	protected int balance = 0;
	
	public BasicInfo(int account) {
		this.account = account;
	}
	
	public BasicInfo(int account, int balance) {
		this.account = account;
		this.balance = balance;
	}
	
	
	public void mtdBalance() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(account+" 계좌잔액 " + df.format(balance) + "원\n");
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int amount) {
		this.balance = this.balance + amount; 
	}
}
