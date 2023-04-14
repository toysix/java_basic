package OverloadExample;

public class OverloadExample {

	public void input(int a) {
		
		System.out.println("정수 1개를 입력 받았습니다.");
		
	}
	
	public void input(int a, int b) {
		
		System.out.println("정수 2개를 입력 받았습니다.");
		
	}
	
	public void input (String a) {
		
		System.out.println("문자열 1개를 입력 받았습니다.");
	}
	
	
	
	public void input (String a,double d ) {
		
		System.out.println("문자열 1개, 실수 1개를 입력 받았습니다.");
	}
	
	public void input (double d, String s) {
		
		System.out.println("더블 1개, 문자열 1개를 입력 받았습니다.");
	}
	
	//public void input (int i) {
		
	//	System.out.println("이름, 타입이 다 같으면..??");
	

	
	
		
	}


