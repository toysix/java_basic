package example.thread;


// 보조 쓰레드에서 실행할 내용을 정의하기 이ㅜ해서
// 1. Runnable 인터페이스를 구현한다.



public class MultyThread implements Runnable{
	
	// 2. Runnable 인터페이스의 run() 메서드를 오버라이딩해 실행 내용을 적는다.
	
	@Override
	public void run(){
		// 여태까지 콛드는 순차적으로 쉬는 시간 없이 실행되어왔음
		// Thread.sleep(초); 는 해당 쓰레드 실행을 입력한 초 만큼 중단한다.
		// 쓰레드 중지는 try~catch 블럭에 반듯이 넣어야 함.
		Try{
			for (int i = 0; i < 500; i++) {
				System.out.println("보조 쓰레드 실행 : "+ i );
				Thread.sleep(1000);
			}
		 
		 
		}catch (Exception e) {
			System.out.println("---------");
		}
		
	}

}
