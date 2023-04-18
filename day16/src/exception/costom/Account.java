package exception.costom;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		
		if (money <0) {
			
			throw new DepositMinusMoneyException("마이너스 대출은 불가능합니다.");
		}
			
			
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if (this.balance < money) {
			throw new BalanceInsufficientException("잔고부족");
		}
		this.balance -= money;
	}

}
