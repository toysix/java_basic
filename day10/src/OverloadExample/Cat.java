package OverloadExample;

public class Cat {
	
	public String kind;
	public int age;
	
	public Cat() {
		
		kind = "품종을 입력해주세요!";
		age = 0;
		
	}
	
	public Cat(String s) {
		
		kind = s;
		System.out.println("지금부터 이 아이는 "+ kind + " 입니다.");
	}
	
	public void call () {
		
		System.out.println("야옹아 야옹아");
	}
	
	public void call (String s) {
		
		System.out.println(s +" 아 이리와");
	}

}
