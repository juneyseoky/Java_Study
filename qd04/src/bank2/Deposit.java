package bank2;

public class Deposit extends BasicInfo {
	// 예금 처리 클래스 
	
	public Deposit(String account) {
		super(account);
	}
	
	@Override
	public void mtdDeposit(int amount) {
		super.balance += amount;
		
		System.out.println("입금확인!");
	}

}
