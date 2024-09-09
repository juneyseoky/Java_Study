package bank;

public class Withdraw extends BasicInfo{

	public Withdraw(int account) {
		super(account);

	}

	public void mtdWithdraw(int amount) {
		setBalance(-amount);
		System.out.println("출금확인!");
	}
}
