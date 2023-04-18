package exception.runtime;

public class nullPointExample {
	
	public static void main(String[] args) {
		
		
		String str = null;
		//str = "Hello";
		
		//toLowercase 는 모든 문자열을 소문자로 만들어 준다.
		
		System.out.println(str.toLowerCase());
		System.out.println("예외 특 _ 발생한 지점에서 멈춤");
		
		
	}

}
