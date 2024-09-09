package bank2;

public class Withdraw extends BasicInfo {

	public Withdraw(String account) {
		super(account);
	}
	@Override
	public void mtdWithdraw(int amount) {
		super.balance -= amount;
		System.out.println("출금확인");
	}

}
