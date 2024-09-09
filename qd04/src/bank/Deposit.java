package bank;


public class Deposit extends BasicInfo{

	
	public Deposit(int account) {
		super(account);
	}
	
	public void mtdDeposit(int amount) {
		setBalance(amount);
		System.out.println("입금확인!");

	}
}
