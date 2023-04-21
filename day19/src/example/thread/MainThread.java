package example.thread;

//  주 쓰레드 역활을 할 클래스

public class MainThread {

	public static void main(String[] args) {
		
		// 보조쓰레드 실행을 위해서는 먼저 Thread 객체를 생성해야 함.
		
		// 1. Runnable 구현체 생성
		Runnable trd = new MultyThread();
		
		
		// 2. Thread 클래스의 인스터를 생성
		// 생성자 호출시 위의 Runnable 구현체를 파라미터로 넘김
		
		Thread sTrd  = new Thread(trd);
		
		System.out.println("보조 쓰레드 준비 완료!");
		
		// 3. 보조쓰레드는 .start()으로 호출할 수 있음
		
		sTrd.start();
		System.out.println(" 먼저 끝날지 알 수 없는 메인 쓰레드");
		
		
	}
	
}
