package exception.costom;

public class MainClass {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.deposit(100000);
		
		System.out.println(new StringBuffer("입금 후 잔액 : ").append(acc.getBalance()).append("원"));
			
		try {
			acc.deposit(10000);
		
		}catch (DepositMinusMoneyException e) {
			
			/*
			 * 예외 클래스가 제공하는 getMessage() 메서드는 예외의 원인 메시지를 String타입으로 리턴한다.
			 * 자바 표준 API에서 제공하는 다양한 예외클래스들은 각각의 예외 어ㅜㄴ인 메시지가 기본적으로 객체 안에 저장되어 있음
			 */
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		
		
		try {
			acc.withdraw(10000000);
		}catch (BalanceInsufficientException e) {
			
			/*
			 * 예외 클래스가 제공하는 getMessage() 메서드는 예외의 원인 메시지를 String타입으로 리턴한다.
			 * 자바 표준 API에서 제공하는 다양한 예외클래스들은 각각의 예외 어ㅜㄴ인 메시지가 기본적으로 객체 안에 저장되어 있음
			 */
			
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println(new StringBuffer("출금 후 잔액 : ").append(acc.getBalance()));
		
	}

}
