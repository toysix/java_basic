package exception.trycatch;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
	
	
	int i = 10;
	
	 int j= 0;
	
	//int j = 5;
	
	try { // 예외가 발생할 가능성이 있는 코드를 넣는 구역
		System.out.println(i/j);
		System.out.println(new StringBuffer("예외 발생 안할때만 실행됨"));
	} catch(Exception e) {
		System.out.println(new StringBuffer("0으로 나눠서 catch 블록으로 넘어왔습니다."));
		
	}
	
	System.out.println("어쨋든 잘 마무리 됐습니다.");
	
	}

}
