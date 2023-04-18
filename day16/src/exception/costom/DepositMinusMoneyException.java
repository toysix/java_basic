package exception.costom;

public class DepositMinusMoneyException extends RuntimeException{
	
	public DepositMinusMoneyException() {}
	
	public DepositMinusMoneyException(String message) {
		super(message);
	}

}
